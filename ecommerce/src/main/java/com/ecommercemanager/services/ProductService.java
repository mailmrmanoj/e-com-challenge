package com.ecommercemanager.services;

import com.ecommercemanager.domain.ProductObj;


import java.util.List;


public interface ProductService {

    List<ProductObj> findAll();

    List<ProductObj> findByMonthAndYear(String month, int year);

    List<ProductObj> findByYear(int year);

    void saveOrUpdateExpense(ProductObj product);

    void deleteProduct(String id);

}