package com.example.bucketapp.controller;

import com.example.bucketapp.facade.interfaces.IBucketDataFacade;
import com.example.bucketapp.shop.Bucket;
import com.example.bucketapp.shop.BucketCost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;


@Controller
@RequestMapping(value = "/bucket")
public class BucketController {

    @Autowired
    IBucketDataFacade bucketDataFacade;

    @PostMapping(value = "/price", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BucketCost getBucketPrice(@RequestBody Bucket bucket) {
        BucketCost bucketCost = bucketDataFacade.getBucketCost(bucket);

        if (bucketCost == null) {
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }

        return bucketCost;
    }
}
