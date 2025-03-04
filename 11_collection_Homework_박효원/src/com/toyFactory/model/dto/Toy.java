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

	public Toy(String toyName, int age, int price, String color, String createDate, Set<String> material) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.createDate = createDate;
		this.material = material;
	}

	/** 아래 toString() 에서 재료명 표기 시 사용함
	 * materials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	 * @return
	 */
	public String getMaterialAsString() {
		StringBuilder sb = new StringBuilder(); // 가변 문자열 객체(비동기)
		
		if(material.size() == 0) {
			return "없음";
		}
		
		//  ex )   [고무, 면직물]
		// 재료가 있다면 materials 순회하면서 재료 하나하나 , 로 구분하여 문자열 만들기
		for(String materials : material) {
			sb.append(materials).append(", "); // 문자열 뒤에 이어쓰기
		}
		
		// ex)   "고무, 면직물, "
		
		// 만들어진 문자열의 마지막 쉼표와 공백 제거하기
		sb.setLength(sb.length() -2);
		
		return sb.toString();
	}
	

	@Override
	public String toString() {
		return "이름 : " + toyName + " / 가격 : " + price + " / 색상 : " + color + " / 사용 가능 연령 : " + age + " / 제조년월일 : "
				+ createDate + " / 재료 : " + getMaterialAsString() + "]";
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
