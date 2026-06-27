package com.example.simpleWebApp.services;

import com.example.simpleWebApp.models.Product;
import com.example.simpleWebApp.repo.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class productService{
    @Autowired
    productRepo repo ;
//    List<Product> list= new ArrayList<>(Arrays.asList(new Product(101,"mobile",100),new Product(102,"laptop",200)));
    public List<Product> getProducts(){
        return repo.findAll();
    }
    public Product getProductById(int prodId)
    {
        return repo.findById(prodId).orElse(new Product(0,"no item",0));
//        return list.stream().filter((p)->p.getProdId()==prodId).findFirst().orElse(new Product(0,"No Item",0));
    }
    public void addProduct(Product product)
    {
        repo.save(product);
    }
    public Product updateProduct(int prodId, Product product) {
       repo.save(product);
       return  product;
    }
    public boolean deleteProduct(int prodId) {
         repo.deleteById(prodId);
         return true;
    }






}