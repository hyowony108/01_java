package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample1 {

	
	/*
	 * 배열(Array)
	 * 
	 * -같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 하나의 배열명으로 불러지고
	 * 구문은 index를 이용함 (index는 0부터 시작하는 정수)
	 * */
	
	public void ex1() {
		//변수 vs 배열
		
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num 이라는 이름을 부여.
		
		//변수 대입
		num = 10;
		// 생성된 num이라는 변수 공간에 10 이라는 정수값 대입
		
		//변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		//-----------------
		
		// 배열 선언
		int[] arr;
		//int arr[];
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다**
		
		// 배열 할당
		arr = new int[3];
		// new : "new 연산자"라고 하며
		//		Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		
		// int[3] : int자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : heap 영역에 int 형 변수 3칸 짜리 int[] 을 생성(할당)
		
		// arr = new int[3];
		// int[] int[] -> 같은 자료형 == 연산가능!
		
		System.out.println("arr : " + arr); // 주소값 출력
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// -> Heap 영역에 생성돤 공간은 절대 비어있을 수 없다
		// -> JVM 기본값이 들어가져있다
		// boolean : false
		// 나머지 : 0
		// 참조형 : null
		
		//배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		
		// 배열 요소 값 대입
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//[10, 50, 100] 실제로 arr배열이 가진 모든 요소의 값을 알고싶을때
		// Arrays.toString(배열명);
		System.out.println(Arrays.toString(arr));
		
	}

	public void ex2() {
		
		// 배열 선언 및 할당
		int[] arr = new int[4];
		
		// arr[0~3] 전부 JVM에 의해 0으로 초기화 되어있는 상태
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		// arr[4] = 5000;
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// 배열의 인덱스 범위를 벗어남 : 길이가 4칸 짜리 배열인데, 없느 ㄴ인덱스 번호인 4에 접근했다
		
		// 코드에서 빨간줄 에러 : 컴파일 에러
		// 실행했을 때 발생하는 에러 : 런타임 에러
		
		// 배열과 for문
		// 배열의 길이 (몇 칸 인가) : 배열명.lenght
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			// i -> 0 1 2 3
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
			//	arr[0]에 저장된 값 : 100
			//	arr[1]에 저장된 값 : 200
			//	...
		}
		
		// 선언과 동시에 초기화
		int[] arr2 = {1, 2, 3, 4, 5};
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr2라는 이름 부여
		// Heap 메모리 영역에 int 5칸 짜리 int[]을 생성하고
		// 0번 인덱스부터 각 요소에 1~5까지 초기화함(대입)
		// int[] 주소값을 arr2 참조변수가 참조함
		
		System.out.println( Arrays.toString(arr2));
	}

	public void ex3() {
		
	}

	public void ex4() {
		
	}

	public void ex5() {
		
	}
	
	public void ex6() {
		
	}
	
	public void ex7() {
		
	}
	
	public void ex8() {
		// String 참조형
		
		String str = "가나다"; // String Constant Pool 저장
		String str2 = new String("가나다"); // Heap 새 객체 저장
		
		System.out.println(str); // 주소값?
		System.out.println(str2);
		System.out.println(str.toString());
		
		// String 클래스의 toString() 메서드가 존재
		// toString() 메서드느 자기 자신을 그대로 반환.
		
		// System.out.println(str); 을 실행하면
		// str.toString() 이 자동으로 호출됨
		// 대입해둔 문자열 값 자체가 반환됨..
		
		//주소값(객체의 해시코드)을 확인하고 싶다면 아래처럼 사용..
		System.out.println(System.identityHashCode(str));
		
		String[] strArr = {"사과", "바나나", "딸기"};
		// 메모리 구조가 어떻게 생겼을까?
	}
	
}
