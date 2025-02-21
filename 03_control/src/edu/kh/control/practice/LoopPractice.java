package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
			단, 입력한 수는 1보다 크거나 같아야 합니다.
			만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
			
			ex.
			1이상의 숫자를 입력하세요 : 4 					1이상의 숫자를 입력하세요 : 0
			1 2 3 4 										1 이상의 숫자를 입력해주세요.
		 */
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1 ; i <= num ; i++) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
		
	}

	public void practice2(){
		/*사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		ex.
		1이상의 숫자를 입력하세요 : 4 				1이상의 숫자를 입력하세요 : 0
		4 3 2 1 									1 이상의 숫자를 입력해주세요.
		 * */
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num ; i >= 1 ; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice3(){
		/*1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

			ex.
			정수를 하나 입력하세요 : 8
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 * */
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
			System.out.printf(i + " ");
			if(i < num) {
				System.out.print("+ ");
			}else {
				System.out.print("= ");
			}
		}
		System.out.println(sum);
		
	}

	public void practice4(){
		/*사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
			만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
			
			ex.
			첫 번째 숫자 : 8 	첫 번째 숫자 : 4 	첫 번째 숫자 : 9
			두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
			4 5 6 7 8 			4 5 6 7 8			1 이상의 숫자를 입력해주세요.
		 * */
		
		System.out.print("첫 번째 숫자 : ");
		int one = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int two = sc.nextInt();
		
		if(one >= 1 && two >= 1) {
			
			if(one < two) {
				for(int i = one ; i <= two ; i++) {
					System.out.print(i + " ");
				}
			}else {
				for(int i = two ; i <= one ; i++) {
					System.out.print(i + " ");
				}
			}
			
		}else { System.out.println("1 이상의 숫자를 입력해주세요.");}
	}
	
	public void practice5(){
		/*사용자로부터 입력 받은 숫자의 단을 출력하세요.

			ex.
			숫자 : 4
			===== 4단 =====
			4 * 1 = 4
			4 * 2 = 8
			4 * 3 = 12
			4 * 4 = 16
			4 * 5 = 20
			4 * 6 = 24
			4 * 7 = 28
			4 * 8 = 32
			4 * 9 = 36
		 * */
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}
	
	public void practice6(){
		/*사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
			단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
			
			숫자 : 4 					숫자 : 10
			===== 4단 ===== 			2~9 사이 숫자만 입력해주세요.
			===== 5단 =====
			===== 6단 =====
			===== 7단 =====
			===== 8단 =====
			===== 9단 =====
			(해당 단의 내용들은 길이 상 생략)
		 * */
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			for(int i = dan ; i <= 9 ; i++) {
				
				System.out.println("===== " + i + "단 =====");
				
				for(int num = 1 ; num <= 9 ; num++) {
					System.out.printf("%d * %d = %d\n", i, num, i * num);
				}
			}
		}else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
	}
	
	public void practice7(){
		/*다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 4
			*
			**
			***
			****
			*
			* - 행(row)은 입력한 input 만큼
			* - 열(col)은 현재행(row)만큼 반복
		 * */
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String star = "*";
		
		for(int i = 1 ; i <= input ; i++) {
			
			for(int num = 1 ; num <= i ; num++) {
			System.out.print(star);
			}
			System.out.println();
		}
	}
	
	public void practice8(){
		/*다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 4
			****
			***
			**
			*
		*/
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input ; i >= 1 ; i-- ) {
			for(int num = i ; num >= 1 ; num--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9(){
		/*다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 4
			   *
			  **
			 ***
			****
		 */
		
		System.out.print("정수 입력 : ");
		int j = sc.nextInt();
		
		for(int i = 1 ; i <= j ; i++) {
			for(int num = j ; num - 1 >= i ; num--) {
				System.out.print(" ");
			}
			for(int star = 1 ; star <= i ; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10(){
		/*다음과 같은 실행 예제를 구현하세요.

			ex.
			정수 입력 : 3
			*
			**
			***
			** 4 2
			*  5 1
		*/
		
		System.out.print("정수 입력 : ");
		int inp = sc.nextInt();
		int sum = 0;
		
		/*
		for(int i = 1 ; i <= inp + (inp - 1) ; i++) {
			if(i <= inp) {
				for(int num = 1 ; num <= i ; num++) {
					System.out.print("*");
				}
				System.out.println();
				
			}else { // i = 6 // inp = 4
				for(int num = i ; num + 1 >= inp + sum ; num--) {
					sum++;
					System.out.print("*");
				}
				System.out.println();
				
			}*/
		for(int i = 1 ; i <= inp ; i++) {
			for(int num = 1 ; num <= i ; num++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = inp ; i >= 1 ; i--) {
			for(int num = i ; num - 1 >= 1 ; num--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice11(){
		/*다음과 같은 실행 예제를 구현하세요.

		ex.
		정수 입력 : 4
		   *
		  ***
		 *****
		*******
	*/
		
		System.out.print("정수 입력 : ");
		int j = sc.nextInt();
		
		for(int i = 1 ; i <= j ; i++) {
			for(int num = j ; num - i >= 1 ; num--) {
				System.out.print(" ");
			}
			for(int star = 1 * 2 ; star <= i * 2 ; star++) {
				System.out.print("*");
			}
			for(int num = j ; num - i >= 1 ; num--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	public void practice12(){
		/*ex.
			정수 입력 : 5
			*****
			*   *
			*   *
			*   *
			*****
*/
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1 ; row <= input ; row++) {
			if(row == 1 || row == input) {
				for(int col = 1 ; col <= input ; col++) {
					System.out.print("*");
					
					}
			
				}else {
					for(int col = 1; col <= input ; col++) {
						if(col ==1 || col == input) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
			}
			System.out.println();
		}
		
		
	}
	
	public void practice13(){
		/*1부터 사용자에게 입력 받은 수까지 중에서
			1) 2와 3의 배수를 모두 출력하고
			2) 2와 3의 공배수의 개수를 출력하세요.
			
			* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
			모두 나머지가 0이 나오는 수
			
			ex.
			자연수 하나를 입력하세요 : 15
			2 3 4 6 8 9 10 12 14 15
			count : 2
		 * */
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1 ; i <= input ; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
				
			}else if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		System.out.println("count : " + count);
	}
}
