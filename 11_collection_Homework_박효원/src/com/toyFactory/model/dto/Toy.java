package com.toyFactory.model.dto;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Toy {
	private String toyName;
	private int age;
	private int price;
	private String color;
	private String createDate;
	private Set<String> material;
	
	public Toy() {}

	public Toy(String toyName, int age, int price, String color, String createDate, String...material) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.createDate = createDate;
		this.material = new HashSet<String>();
		
		for(String str : material) {
			
			this.material.add(str);
		}
	}
	
	

	@Override
	public String toString() {
		return "이름 : " + toyName + " / 가격 : " + price + " / 색상 : " + color + " / 사용 가능 연령 : " + age + " / 제조년월일 : "
				+ createDate + " / 재료 : " + material + "]";
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Set<String> getMaterial() {
		return material;
	}

	public void setMaterial(Set<String> material) {
		this.material = material;
	}

	@Override
	public int hashCode() {
		return Objects.hash(material, age, color, createDate, price, toyName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return Objects.equals(material, other.material) && age == other.age && Objects.equals(color, other.color)
				&& Objects.equals(createDate, other.createDate) && price == other.price
				&& Objects.equals(toyName, other.toyName);
	}

	
	
	
}
