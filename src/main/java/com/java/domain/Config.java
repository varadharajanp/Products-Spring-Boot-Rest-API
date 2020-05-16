package com.java.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Config {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull(message = "Please provide a height")
	private int height;

	@NotNull(message = "Please provide a width")
	private int width;

	@NotEmpty(message = "Please provide a unit")
	private String unit;

	@NotEmpty(message = "Please provide a color")
	private String color;

	public Config() {
	}

	public Config(Long id, int height, int width, String unit, String color) {
		this.id = id;
		this.height = height;
		this.width = width;
		this.unit = unit;
		this.color = color;
	}

	public Config(int height, int width, String unit, String color) {
		this.height = height;
		this.width = width;
		this.unit = unit;
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Config [id=" + id + ", height=" + height + ", width=" + width + ", unit=" + unit + ", color=" + color
				+ "]";
	}

}
