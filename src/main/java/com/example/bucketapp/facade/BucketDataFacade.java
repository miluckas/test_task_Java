package com.example.bucketapp.facade;

import com.example.bucketapp.facade.interfaces.IBucketDataFacade;
import com.example.bucketapp.service.interfaces.IProductService;
import com.example.bucketapp.shop.Bucket;
import com.example.bucketapp.shop.BucketCost;
import com.example.bucketapp.shop.ProductAmountInfo;
import com.example.bucketapp.shop.ProductValue;
import com.example.bucketapp.shop.request.ProductPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BucketDataFacade implements IBucketDataFacade {

    @Autowired
    IProductService productService;

    private ProductValue loadProductCost(ProductAmountInfo product) {
        ProductPrice productPrice = productService.getProductPrice(product.getId());
        if (productPrice != null) {
            BigDecimal priceForAmount = productPrice.getPrice().multiply(BigDecimal.valueOf(product.getAmount()));
            return new ProductValue(product.getId(), product.getAmount(), priceForAmount);
        }
        return null;
    }

    @Override
    public BucketCost getBucketCost(Bucket bucket) {
        if (bucket.getProducts() != null && !CollectionUtils.isEmpty(bucket.getProducts())) {
            List<ProductValue> products = bucket.getProducts()
                    .parallelStream()
                    .map(this::loadProductCost)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());

            BigDecimal value = BigDecimal.valueOf(0);

            BigDecimal bucketCost = products.stream()
                    .map(ProductValue::getPrice)
                    .reduce(value, BigDecimal::add);

            return new BucketCost(products, bucketCost);
        }

        return null;
    }
}
