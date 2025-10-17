package com.demo.spring.springDemo.view;

import com.demo.spring.springDemo.model.Product;
import com.demo.spring.springDemo.repository.ProductRepo;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.*;

public class ProductServiceTest {

    @Mock
    ProductRepo productRepo;

    @InjectMocks
    ProductService productService;

    @BeforeEach
     void setUp(){
        MockitoAnnotations.openMocks(this);
    }
@Test
    public void testAddProduct(){
        Product product=new Product();
        product.setId(1);
        product.setName("Test Product");
        product.setPrice(100.0);
        when(productRepo.save(product)).thenReturn(product);
        boolean result=productService.addProduct(product);
        assert(!result);
        verify(productRepo,times(1)).save(product);
    }




}
