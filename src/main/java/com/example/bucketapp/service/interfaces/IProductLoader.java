package com.example.bucketapp.service.interfaces;

import com.example.bucketapp.shop.request.IProductRequestData;
import com.example.bucketapp.shop.request.ProductPrice;
import com.example.bucketapp.shop.request.ProductRequest;

public interface IProductLoader {

    IProductRequestData makeRequest(ProductRequest request);
}
