package com.example.bucketapp.service.interfaces;

import com.example.bucketapp.shop.request.ProductPrice;

public interface IProductService {

    ProductPrice getProductPrice(Integer id);
}
