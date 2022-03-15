package com.example.bucketapp.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductValue {

    private Integer id;

    private Integer amount;

    private BigDecimal price;
}
