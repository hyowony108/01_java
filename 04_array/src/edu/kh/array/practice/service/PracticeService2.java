package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService2 {

	Scanner sc = new Scanner(System.in);
	
	public void ex13() {
		/*사용자가 입력한 배열의 길이만큼의 
		 * 문자열 배열을 선언 및 할당하고
			배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
			단, 사용자에게 배열에 값을 더 넣을지 물어보고 
			몇 개를 더 입력할 건지,
			늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
			사용자가 더 이상 입력하지 않겠다고 하면 
			배열 전체 값을 출력하세요.
			
			[실행 화면]
			배열의 크기를 입력하세요 : 3
			1번째 문자열 : 자바의 정석
			2번째 문자열 : 알고리즘
			3번째 문자열 : C프로그래밍
			더 값을 입력하시겠습니까?(Y/N) : y
			더 입력하고 싶은 개수 : 2
			4번째 문자열 : 인간관계
			5번째 문자열 : 자기계발
			더 값을 입력하시겠습니까?(Y/N) : y
			더 입력하고 싶은 개수 : 1
			6번째 문자열 : 영단어600
			더 값을 입력하시겠습니까?(Y/N) : n
			[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		 * */
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		
		for(int i = 0 ; i < size ; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			String input = sc.nextLine();
			
			arr[i] = input;
			
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'y' || ch == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int more = sc.nextInt();
				sc.nextLine();
				
				String[] newArr = new String[arr.length + more];
				
				for(int i = 0 ; i < newArr.length ; i++) {
					if(i < arr.length) {
						newArr[i] = arr[i];
					} else {
						System.out.print((i + 1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();

					}
				}
				
				arr = newArr;
				
			}else if (ch == 'n' || ch == 'N') {
				break;
				
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
