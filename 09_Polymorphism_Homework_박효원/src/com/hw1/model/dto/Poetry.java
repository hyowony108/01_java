package com.hw1.model.dto;

public class Poetry extends Book{

	public int nuberOfPoems;

	public Poetry() {}
	
	public Poetry(String title, String author, int nuberOfPoems) {
		super(title, author);
		this.nuberOfPoems = nuberOfPoems;
	}

	@Override
	public void displayInfo() {
		System.out.println("[전문 서적] 제목 : " + getTitle() +  " / 저자 : " + getAuthor() +
				" / 시 수 : " + nuberOfPoems);
	}

	public int getNuberOfPoems() {
		return nuberOfPoems;
	}

	public void setNuberOfPoems(int nuberOfPoems) {
		this.nuberOfPoems = nuberOfPoems;
	}
	
	
}
