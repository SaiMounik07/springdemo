package com.demo.spring.springDemo.view;

import com.demo.spring.springDemo.model.Product;
import com.demo.spring.springDemo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    static List<Product> products = new ArrayList<>();
    @Autowired
    ProductRepo productRepo;

    public boolean addProduct(Product product){
       return productRepo.save(product) != null;
    }
    public List<Product> getProducts(){
        return productRepo.findAll();
    }
    public Product getProduct(int id){
        return products.get(id);
    }

    public Product updateProduct(int id, Product product){
        products.set(id, product);
        return products.get(id);
    }


}
