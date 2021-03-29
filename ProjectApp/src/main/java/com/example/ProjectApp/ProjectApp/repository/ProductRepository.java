package com.example.ProjectApp.ProjectApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProjectApp.ProjectApp.Driver.ProductModel;
@Repository
public interface ProductRepository extends JpaRepository<ProductModel,String>{

}
