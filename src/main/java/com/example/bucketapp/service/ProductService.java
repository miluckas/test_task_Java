package com.example.bucketapp.service;

import com.example.bucketapp.service.interfaces.IProductLoader;
import com.example.bucketapp.service.interfaces.IProductService;
import com.example.bucketapp.shop.request.ProductPrice;
import com.example.bucketapp.shop.request.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import static com.example.bucketapp.config.CacheConfig.PRODUCTS_PRICE;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductLoader productLoader;

    @Cacheable(value = PRODUCTS_PRICE, unless = "#result == null")
    @Override
    public ProductPrice getProductPrice(Integer id) {
        ProductRequest productRequest = null;
        // TODO prepare request
        return (ProductPrice) productLoader.makeRequest(productRequest);
    }
}
