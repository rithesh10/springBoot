package com.example.myWebApp.Controllers;

import com.example.myWebApp.services.ProductService;
import com.example.myWebApp.models.Product;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ProductController{

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @RequestMapping("/products/{prodId}")  
    public Product getProductById(@PathVariable int prodId) {
        return productService.getProductById(prodId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
        // System.out.println(prod);
        productService.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod)
    {
        productService.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId)
    {
        productService.
    }
    
}
