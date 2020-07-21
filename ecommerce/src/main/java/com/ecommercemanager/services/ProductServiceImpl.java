package com.ecommercemanager.services;


import java.util.List;

import com.ecommercemanager.domain.ProductObj;
import com.ecommercemanager.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductObj> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductObj> findByMonthAndYear(String month, int year) {
        return productRepository.findByMonthAndYear(month, year);
    }

    @Override
    public void saveOrUpdateExpense(ProductObj product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductObj> findByYear(int year) {
        return productRepository.findByYear(year);
    }

}