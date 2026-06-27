package com.example.simpleWebApp.repo;

import com.example.simpleWebApp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<Product,Integer> {
}
