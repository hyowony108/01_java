package com.hw4.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw4.model.dto.Book;

public class BookService {

	Scanner sc = new Scanner(System.in);
	
	// Book 타입 리스트 생성
	List<Book> bookList = new ArrayList<>();
	
	public BookService() {

		// 기본적으로 제공될 책 정보를 리스트에 집어넣기
	}
}
