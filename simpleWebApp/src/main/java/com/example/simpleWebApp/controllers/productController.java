package com.example.simpleWebApp.controllers;

import com.example.simpleWebApp.models.Product;
import com.example.simpleWebApp.services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {
    @Autowired
    productService service;
    @RequestMapping("/products")
    public List<Product> products(){
        return service.getProducts();
    }
    @RequestMapping("/products/{prodID}")
    public Product getProductById(@PathVariable int prodID)
    {
        return service.getProductById(prodID);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product)
    {
        service.addProduct(product);
    }
    @PutMapping("/products/{prodId}")
    public Product updateProduct(@PathVariable int prodId,@RequestBody Product product)
    {
        return service.updateProduct(prodId,product);
    }
    @DeleteMapping("/products/{prodId}")
    public boolean deleteProduct(@PathVariable int prodId)
    {
        return service.deleteProduct(prodId);
    }


}
