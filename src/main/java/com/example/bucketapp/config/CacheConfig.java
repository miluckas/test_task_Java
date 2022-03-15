package com.example.bucketapp.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EnableCaching
@Configuration
public class CacheConfig {

    public static final String PRODUCTS_PRICE = "products_price";

    @Bean
    public RestTemplate restTemplate() {
        return null;
    }

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager(PRODUCTS_PRICE);
    }
}
