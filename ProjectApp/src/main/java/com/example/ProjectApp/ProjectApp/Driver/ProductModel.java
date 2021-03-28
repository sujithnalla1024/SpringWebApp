package com.example.ProjectApp.ProjectApp.Driver;

public class ProductModel {
          private String ProductId;
          private String ImageUrl;
          private String ProductName;
          private String price;
          private String description;
          private String quantity;
          public ProductModel() {
        	  
          }
          public ProductModel(String productId, String imageUrl, String productName, String price, String description,
  				String quantity) {
  			ProductId = productId;
  			ImageUrl = imageUrl;
  			ProductName = productName;
  			this.price = price;
  			this.description = description;
  			this.quantity = quantity;
  		}
		public String getProductId() {
			return ProductId;
		}
		public void setProductId(String productId) {
			ProductId = productId;
		}
		public String getImageUrl() {
			return ImageUrl;
		}
		public void setImageUrl(String imageUrl) {
			ImageUrl = imageUrl;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		
          
}
