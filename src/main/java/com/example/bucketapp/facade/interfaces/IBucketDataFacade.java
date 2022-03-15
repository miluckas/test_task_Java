package com.example.bucketapp.facade.interfaces;

import com.example.bucketapp.shop.Bucket;
import com.example.bucketapp.shop.BucketCost;
import com.example.bucketapp.shop.ProductAmountInfo;
import com.example.bucketapp.shop.ProductValue;

public interface IBucketDataFacade {

    BucketCost getBucketCost(Bucket bucket);

}
