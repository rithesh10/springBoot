package com.example.myWebApp.services;

import com.example.myWebApp.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service  // Use @Service instead of @Component for clarity
public class ProductService {

    private  List<Product> products = new ArrayList<>(
        Arrays.asList(
            new Product(1, "mobile", 1000),
            new Product(2, "laptop", 90000)
        )
    );

    public List<Product> getProducts() {
        System.out.println(products);
        return products;
    }

    public Product getProductById(int prodId) {
        // This will throw NoSuchElementException if not found
        // Optional to safely handle missing product
        Optional<Product> product = products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst();

        return product.orElse(null);  // or throw custom exception if needed
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }
    public void updateProduct(Product prod) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                products.set(i, prod);
                return; // optional: stop after updating
            }
        }
    }
    public void deleteProduct(int prodId)
    {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() ==prodId) {
                products.remove(i);
                return; // optional: stop after updating
            }
        }
    }
    
}
