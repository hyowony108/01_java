package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class Service {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Book> bookList = new ArrayList<>();
	
	
	public Service() {
		
		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
		
	}
	
	public void displayMenu() {
		
		int num = 0;
		
		do {
			System.out.println("=== 도서 목록 프로그램===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴를 입력하세요 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num){
			case 1 : System.out.println(addBook()); break;
			case 2 : serchBook(); break;
			case 3 : ; break;
			case 4 : ; break;
			case 5 : ; break;
			case 6 : ; break;
			case 7 : ; break;
			case 0 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("메뉴 번호만 입력해주세요.");
			}
		}while(num != 0);
		
	}
	
	public String addBook() {
		
		System.out.println("==도서 등록==");
		System.out.print("번호 : ");
		int number = sc.nextInt();
		System.out.print("제목 : ");
		String title = sc.nextLine();
		sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("출판사 : ");
		String publisher = sc.next();
		
		bookList.add(new Book(number, title, author, price, publisher));
		
		return "등록 완료";
	}

	public void serchBook() {
		
		System.out.println("==도서 조회==");
		
		if(bookList.isEmpty()) {
			System.out.println("조회된 도서 정보가 없습니다.");
			return;
		}
		
		for(Book b : bookList) {
			System.out.println(b);
		}
	}
	
	public void editBook() {
		System.out.println("==도서 수정==");
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int input = sc.nextInt();
		
		System.out.println("1. 도서명");
		System.out.println("2. 도서 저자");
		System.out.println("3. 도서 가격");
		System.out.println("4. 도서 출판사");
		System.out.println("0. 수정 종료");
		System.out.print("어떤 정보를 수정하시겠습니까? : ");
		int edit = sc.nextInt();
		
		Book b;
		int num = 0;
		
		for(int i = 0 ; i < bookList.size() ; i++) {
			if(input == bookList.get(i).getNumber()) {
				num = i;
				break;
			}
		}
		
		switch(edit) {
		case 1 : 
			System.out.print("수정할 도서명을 입력하세요 : ");
			String title = sc.nextLine();
			sc.nextLine();

			
			
			
			
			break;
		case 2 : break;
		case 3 : break;
		case 4 : break;
		case 0 : break;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
