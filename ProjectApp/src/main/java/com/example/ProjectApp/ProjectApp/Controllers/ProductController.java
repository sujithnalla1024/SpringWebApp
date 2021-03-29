package com.example.ProjectApp.ProjectApp.Controllers;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	import com.example.ProjectApp.ProjectApp.Driver.ProductModel;
	import com.example.ProjectApp.ProjectApp.services.ProductService;
	@RestController
	public class ProductController {
	@Autowired
	ProductService productservice;
	@GetMapping("/home")
	public List<ProductModel> allProducts(){
	return productservice.findall();
	}

	

}
