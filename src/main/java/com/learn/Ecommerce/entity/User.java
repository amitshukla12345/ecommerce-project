package com.learn.Ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity// use to create table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id // use for primary key
	private String id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false,unique =true)
	private String emailId;
	@Column(nullable = false)
	private String password;
	@Column (nullable = false)
	private int age;

}
