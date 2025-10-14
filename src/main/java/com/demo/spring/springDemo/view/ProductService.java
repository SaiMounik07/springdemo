package com.demo.spring.springDemo.view;

import com.demo.spring.springDemo.model.Product;
import com.demo.spring.springDemo.repository.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Optional<Product> product = productRepo.findById(id);
        if (product.isPresent()) {
            return product.get();
        }
        return null;
    }
    public Product updateProduct(int id, Product product){
       Optional<Product> existingProduct = productRepo.findById(id);
       if (existingProduct.isPresent()) {
           Product p = existingProduct.get();
           p.setName(product.getName());
           p.setPrice(product.getPrice());
           return productRepo.save(p);
       }
       return null;
    }
    public String deleteProduct(Integer id) {
        productRepo.deleteById(id);
        return "Product Deleted";
    }

    public List<Product> findByName(String name) {
        return productRepo.findByName(name);

    }
}
