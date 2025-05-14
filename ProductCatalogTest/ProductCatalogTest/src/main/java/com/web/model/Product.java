package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Product {
    @Id
   
    private Long id;


	    private String name;
	    private String description;
	    private double price;
	    private String imageUrl;
	    
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}


		

		public Long getId() {
			return id;
		}




		public void setId(Long id) {
			this.id = id;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public String getDescription() {
			return description;
		}




		public void setDescription(String description) {
			this.description = description;
		}




		public double getPrice() {
			return price;
		}




		public void setPrice(double price) {
			this.price = price;
		}




		public String getImageUrl() {
			return imageUrl;
		}




		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}




		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
					+ ", imageUrl=" + imageUrl + "]";
		}
	    
	    
	
}
