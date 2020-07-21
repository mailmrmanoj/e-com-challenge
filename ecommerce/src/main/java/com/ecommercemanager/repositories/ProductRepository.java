package com.ecommercemanager.repositories;

import java.util.List;

import com.ecommercemanager.domain.ProductObj;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductObj, String> {



}

