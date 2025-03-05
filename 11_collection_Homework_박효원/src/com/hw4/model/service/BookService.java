package com.hw4.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw4.model.dto.Book;

public class BookService {

	Scanner sc = new Scanner(System.in);
	
	// Book 타입 리스트 생성
	List<Book> bookList = new ArrayList<>();
	
	public BookService() {

		// 기본적으로 제공될 책 정보를 리스트에 집어넣기
		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
		
	}

	public void menuDisplay() {
		// 메뉴창 만들기
		// 종료 전까지 반복되는 메뉴 -> do while 사용

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
			
			try {
				
				num = sc.nextInt();
				sc.nextLine();
				
				switch(num){
				case 1 : System.out.println(addBook()); break;
				case 2 : serchBook(); break;
				case 3 : System.out.println(editBook()); break;
				case 4 : //delBook(); break;
				case 5 :  break;
				case 6 :  break;
				case 7 : //randomBook(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); break;
				default : System.out.println("메뉴 번호만 입력해주세요.");
				}
				
			}catch(InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해주세요");
			
				num = -1;
				// 잘못 입력되었다면 num = 0으로 유지되어 while 문이 종료됨
			}
			
		}while(num != 0);
		
		
	}

	public String addBook() {
		
		System.out.println("====== 도서 등록 ======");
		
		System.out.print("도서 번호 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		// 동일한 도서 번호 방지
		for(Book b : bookList) {
			if(number == b.getNumber()) {
				return "이미 등록된 번호입니다.";
			}
		}
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.next();
		
		// 리스트에 입력받은 도서 정보 추가
		bookList.add(new Book(number, title, author, price, publisher));

		// String 타입이라서 return
		return "등록 완료";
		
	}

	public void serchBook() {
		
		// 등록된 모든 도서 조회
		for(Book b : bookList) {
			System.out.println(b);
		}
	}

	public String editBook() {
		System.out.println("====== 도서 수정 ======");
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int editB = sc.nextInt();
		
		// 수정할 도서 번호 존재 여부 판별
		boolean flag = true;

		for(Book b : bookList) {
			if(editB == b.getNumber()) {
				
				flag = false;
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				
				System.out.print("어떤 정보를 수정하시겠습니까? : ");
				
				try {
					int editNum = sc.nextInt();
					sc.nextLine();
					
					switch(editNum) {
					case 1 :
						System.out.println("====== 도서명 수정 ======");
						System.out.print("수정할 도서명을 입력하세요 : ");
						String title = sc.nextLine();
						b.setTitle(title);
						break;
					case 2 :
						System.out.println("====== 저자 수정 ======");
						System.out.print("수정할 저자를 입력하세요 : ");
						String author = sc.nextLine();
						b.setAuthor(author);
						break;
					case 3 :
						System.out.println("====== 도서 가격 수정 ======");
						System.out.print("수정할 가격을 입력하세요 : ");
						int price = sc.nextInt();
						sc.nextLine();
						b.setPrice(price);
						break;
					case 4 :
						System.out.println("====== 도서 출판사 수정 ======");
						System.out.print("수정할 출판사를 입력하세요 : ");
						String publisher = sc.nextLine();
						b.setPublisher(publisher);
						break;
					case 0 : System.out.println("수정을 종료합니다.");
						break;
					default : System.out.println("메뉴에 있는 번호만 입력해주세요");
					
					}
					
				}catch (InputMismatchException e) {
					return "입력형식이 유효하지 않습니다.";

				}
			}
			
			if(flag == true) {
				return "일치하는 도서 번호가 존재하지 않습니다.";
			}
			
		}
		return "수정완료";
	}

	



}
