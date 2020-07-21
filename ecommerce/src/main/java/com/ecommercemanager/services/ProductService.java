package com.ecommercemanager.services;

import com.ecommercemanager.domain.ProductObj;


import java.util.List;


public interface ProductService {

    List<ProductObj> findAll();

    void saveOrUpdateProduct(ProductObj product);

    void deleteProduct(String id);

}