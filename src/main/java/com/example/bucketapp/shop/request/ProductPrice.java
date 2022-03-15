package com.example.bucketapp.shop.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductPrice implements IProductRequestData{

    private Integer id;

    private BigDecimal price;
}
