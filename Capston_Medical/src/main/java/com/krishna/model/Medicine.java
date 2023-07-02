package com.krishna.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String brand;
	private int qtyAvailiable;
	private double unitPrice;
	private String picture;
	private String category;
	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicine(String name, String brand, int qtyAvailiable, double unitPrice, String picture, String category) {
		super();
		this.name = name;
		this.brand = brand;
		this.qtyAvailiable = qtyAvailiable;
		this.unitPrice = unitPrice;
		this.picture = picture;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQtyAvailiable() {
		return qtyAvailiable;
	}

	public void setQtyAvailiable(int qtyAvailiable) {
		this.qtyAvailiable = qtyAvailiable;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", brand=" + brand + ", qtyAvailiable=" + qtyAvailiable
				+ ", unitPrice=" + unitPrice + ", picture=" + picture + ", category=" + category + "]";
	}

	
	

}
