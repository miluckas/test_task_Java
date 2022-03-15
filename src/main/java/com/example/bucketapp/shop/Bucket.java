package com.example.bucketapp.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bucket {

    private List<ProductAmountInfo> products;

    private AdditionalBucketInfo additionalInfo;

}
