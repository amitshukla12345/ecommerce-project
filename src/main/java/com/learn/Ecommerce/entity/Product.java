package com.learn.Ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
//@Table(name = "product_details") will help to change table name
//@Table(name = "table-name")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_details")

public class Product {
	@Id
private int productId;
	@Column(nullable = false)
private String productName;
	@Column(name = "description",nullable = false)
private String prodcutDescription;
	@Column(nullable = false)
private int productprice;
	
}
