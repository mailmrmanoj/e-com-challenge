package com.ecommercemanager.controller;


import java.util.ArrayList;
import java.util.List;

import com.ecommercemanager.domain.ProductObj;
import com.ecommercemanager.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/expense")
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping
    public ResponseEntity<?> getAll() {
        List<ProductObj> result = productService.findAll();
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping("/{year}/{month}")
    public ResponseEntity<?> getByMonthYear(@PathVariable("year") int year, @PathVariable("month") String month) {
        List<ProductObj> result = new ArrayList<>();
        if ("All".equals(month)) {
            result = productService.findByYear(year);
        } else {
            result = productService.findByMonthAndYear(month, year);
        }
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addorUpdateExpense(@RequestBody ProductObj product) {
        productService.saveOrUpdateExpense(product);
        return new ResponseEntity("Product added succcessfully", HttpStatus.OK);
    }

    @DeleteMapping
    public void deleteProduct(@RequestParam("id") String id) {
        productService.deleteProduct(id);
    }


}
