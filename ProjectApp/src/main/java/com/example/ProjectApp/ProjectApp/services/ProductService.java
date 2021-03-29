package com.example.ProjectApp.ProjectApp.services;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectApp.ProjectApp.Driver.ProductModel;
import com.example.ProjectApp.ProjectApp.repository.ProductRepository;
import com.example.ProjectApp.ProjectApp.repository.servicinterfaces.ProductInterface;

@Service
public class ProductService implements  ProductInterface{
	@Autowired 
	private ProductRepository productrepository;
	public List<ProductModel> findall(){
		List<ProductModel> products = new ArrayList<ProductModel>();
		Iterator<ProductModel> iterator = productrepository.findAll().iterator();
		while (iterator.hasNext()) {
			products.add(iterator.next());
		}
 
		return products;
	}
	
	
}
