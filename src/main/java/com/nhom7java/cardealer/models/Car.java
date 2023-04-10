package com.nhom7java.cardealer.models;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String make;

	@Column(nullable = false)
	private String model;

	@Column(nullable = false)
	private int productionYear;

	@Column(nullable = false)
	private double price;

	@Column(nullable = false)
	private int mileage;

	@Column(nullable = false)
	private String color;

	@Column(nullable = false)
	private String imageUrl;

	// Constructors

	public Car() {
	}

	public Car(String make, String model, int productionYear, double price, int mileage, String color, String imageUrl) {
		this.make = make;
		this.model = model;
		this.productionYear = productionYear;
		this.price = price;
		this.mileage = mileage;
		this.color = color;
		this.imageUrl = imageUrl;
	}

	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return productionYear;
	}

	public void setYear(int year) {
		this.productionYear = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
