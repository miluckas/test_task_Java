package com.example.bucketapp.service;

import com.example.bucketapp.service.interfaces.IProductLoader;
import com.example.bucketapp.shop.request.IProductRequestData;
import com.example.bucketapp.shop.request.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductLoader implements IProductLoader {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public IProductRequestData makeRequest(ProductRequest request) {
        //Making request via restTemplate here
        return null;
    }
}
