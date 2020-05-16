package com.java.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long id;

	@NotEmpty(message = "Please provide a name")
	private String name;

	@NotNull(message = "Please provide a price")
	@DecimalMin("1.00")
	private BigDecimal price;

	@NotNull(message = "Please provide a quantity")
	private int quantity;

	@NotEmpty(message = "Please provide a productCode")
	private String productCode;

	public Product() {
	}

	public Product(Long id, String name, BigDecimal price, int quantity, String productCode) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.productCode = productCode;
	}

	public Product(String name, BigDecimal price, int quantity, String productCode) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.productCode = productCode;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", productCode="
				+ productCode + "]";
	}

}
