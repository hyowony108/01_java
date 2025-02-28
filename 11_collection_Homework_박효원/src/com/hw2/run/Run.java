package com.hw2.run;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {

		// Zoo 객체 생성
		Zoo zoo = new Zoo();
		
		// Tiger 객체 생성하여 Zoo 에 추가하기
		Tiger tiger = new Tiger();
		zoo.addAnimal(tiger);
		
		// Monkey 객체 생성하여 Zoo 에 추가하기
		Monkey monkey = new Monkey();
		zoo.addAnimal(monkey);
		
		// 동물원 메뉴 출력하여 입력한 값 대로 코드 수행하기
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			zoo.displayMenu();
			
			System.out.print("선택 : ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1 : tiger.sound(); 
					 monkey.sound();
			break;
			case 2 : System.out.println("프로그램을 종료합니다."); break;
			}
			
		}while(input != 2);
		
		
	}

}
