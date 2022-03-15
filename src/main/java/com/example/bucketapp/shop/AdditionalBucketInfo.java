package com.example.bucketapp.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdditionalBucketInfo {

    private PaymentType paymentType;

    private Integer addressId;
}
