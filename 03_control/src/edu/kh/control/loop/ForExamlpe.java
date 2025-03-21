package edu.kh.control.loop;

import java.util.Scanner;

public class ForExamlpe { // 기능 제공용 클래스

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		//1~10 까지 콘솔에 출력하기
		for(int i = 1; i <= 10 ; i++) {
			//반복 수행될 코드
			System.out.println(i);
		}
	}
	
	public void ex2() {
		//영어 알파벳 A 부터 Z 까지 한줄로 출력
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
		for(int i = 'A' ; i <= 'Z' ; i++) {
			System.out.print((char)i);
			
		}
		
		System.out.println("\n=========================");
		
		
		for(char i2 = 'A' ; i2 <= 'Z' ; i2++) {
			System.out.print(i2);
		}
		
	}
	
	public void ex3() {
		//1부터 입력받은 수까지 1씩 증가하며 출력
		System.out.print("번호 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.println(i);
		}
	}

	public void ex4() {
		//정수 5개를 입력받아서 합계 구하기
		
		//[실행화면]
		//입력 1 : 10
		//입력 2 : 20
		//입력 3 : 30
		//입력 4 : 40
		//입력 5 : 50
		//합계 : 150
		
		int sum = 0; // 합계 저장용 변수
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			
			// sum에 입력받은 input 값 누적
			// sum = sum + input
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
	}

	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시
		
		//[실행화면]
		//괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) 7 8 (9) ... 20
		
		//괄호를 표시할 배수 : 4
		// 1 2 3 (4) 5 6 7 (8) ... 20
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= 20 ; i++) {
			
			if(i % num == 0) {//배수일 때
				System.out.print("(" + i + ") ");
				
			}else {// 배수가 아닐 때
				System.out.print(i + " ");
				
			}
			
		}
		
		
		
	}

	public void ex6() {
		//[구구단 출력]
		//2~9 사이 수를 하나 입력 받아
		//해당 단을 출력
		//단, 입력받은 수가 2~9사이 숫자가 아니라면
		//"잘못 입력하셨습니다" 출력
		
		/*
		 * 단 입력 : 5
		 * 5 X 1 = 5
		 * 5 X 2 = 10
		 * ...
		 * 5 X 9 = 45
		 * 
		 * ==============
		 * 
		 * 단 입력 : -5
		 * 잘못 입력하셨습니다.
		 * 
		 * */
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {// 2~9 사이일 때
			
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		}else {// 2~9 사이가 아닐 때
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void ex7() {
		// 숫자 세기 count
		
		//1부터 20까지 1씩 증가하면서
		//입력받은 수의 배수의 총 개수 출력
		//입력받은 수의 배수의 합계 출력
		
		//배수 입력 : 3
		//3 6 9 12 15 18 : 6개
		//3의 배수 합계 : 63
		
		//힌트
		//필요한 변수가 뭐가 있을까?

		int count = 0; //n의 배수의 개수를 세기 위한 변수
		int sum = 0; //n의 배수의 합계를 구하기 위한 변수
		String result = "";
		
		System.out.print("배수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= 20 ; i++) {
			
			if(i % num == 0) { // 배수일 때
				result += i + " "; // "3 6 ..."
				count++; // 갯수 세기
				sum += i;// 합계 누적
				
			}
		}
		
		System.out.printf("%s : %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d", num, sum);
		
	}

	public void ex8() {
		//구구단 모두 출력하기
		for(int dan = 2 ; dan <= 9 ; dan++) { // 2단 ~ 9단까지 차례대로 증가
			
			for(int num = 1 ; num <= 9 ; num++) {// 각 단에 곱해질 1 ~ 9 까지 차례대로 증가
				System.out.printf("%d X %d = %2d  ", dan, num, dan * num);
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
		for(int dan = 9 ; dan >= 2 ; dan--) {
			
			for(int num = 1 ; num <= 9 ; num++) {
				System.out.printf("%d X %d = %2d  ", dan, num, dan * num);
			}
			System.out.println();
		}
	}
}
