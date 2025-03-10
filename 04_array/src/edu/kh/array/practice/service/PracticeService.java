package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);

	public void practice1(){
		/*길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
			순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
			짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
			
			[실행 화면]
			1 2 3 4 5 6 7 8 9
			짝수 번째 인덱스 합 : 25
		 * */
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i + 1;
			
			if(i % 2 == 0) {
				sum += arr[i];
			}
			
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2(){
		/*길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
			순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
			홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
			
			[실행 화면]
			9 8 7 6 5 4 3 2 1
			홀수 번째 인덱스 합 : 20
		 * */
		
		int[] arr = new int[9];
		int x = 9;
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i + x;
			x -= 2;
			if(i % 2 == 0) {
		}else {
			sum += arr[i];
		}
			System.out.printf("%d ", arr[i]);
	}

		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);


}

	public void practice3(){
		/*사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
			1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
			
			[실행 화면]
			양의 정수 : 5
			1 2 3 4 5
		 * */
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i + 1;
			System.out.printf("%d ", arr[i]);
		}
	}

	public void practice4(){
		/*정수 5개를 입력 받아 배열을 초기화 하고
			검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
			배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
			
			[실행 화면 1]
			입력 0 : 5
			입력 1 : 8
			입력 2 : 9
			입력 3 : 10
			입력 4 : 4
			검색할 값 : 8
			인덱스 : 1
			
			[실행 화면 2]
			입력 0 : 5
			입력 1 : 8
			입력 2 : 9
			입력 3 : 10
			입력 4 : 4
			검색할 값 : 1
			일치하는 값이 존재하지 않습니다.
		 * */
		
		int[] arr = new int[5];
		
		for(int i  = 0 ; i < arr.length ; i++) {
			System.out.printf("입력 %d : " , i);
			int input = sc.nextInt();
			
			arr[i] = input;
		}
		
		System.out.print("검색할 값 : ");
		int serch = sc.nextInt();
		
		int serchSc = 0;
		
		for(int x = 0; x < 5 ; x++) {
			if(arr[x] == serch) {
				System.out.println("인덱스 : " + x);
				serchSc = arr[x];
				break;
			}
		}
		
		if(serchSc != serch) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
		
	}
	
	public void practice5(){
		/*문자열을 입력 받아 
		 * 문자 하나하나를 배열에 넣고 
		 * 검색할 문자가 문자열에 몇 개 들어가 있는지
			개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
			
			[실행 화면]
			문자열 : application
			문자 : i
			application에 i가 존재하는 위치(인덱스) : 4 8
			i 개수 : 2
		 * */
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", input, ch);
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count++;
				
			}
		}
		System.out.println();
		
		if(count > 0) {
			System.out.printf("%c 개수 : %d", ch, count);
		}
		
	}

	public void practice6(){
		/*사용자가 배열의 길이를 직접 입력하여 
		 * 그 값만큼 정수형 배열을 선언 및 할당하고
			배열의 크기만큼 사용자가 직접 값을 입력하여 
			각각의 인덱스에 값을 초기화 하세요.
			그리고 배열 전체 값을 나열하고 
			각 인덱스에 저장된 값들의 합을 출력하세요.
			
			[실행 화면]
			정수 : 5
			배열 0번째 인덱스에 넣을 값 : 4
			배열 1번째 인덱스에 넣을 값 : -4
			배열 2번째 인덱스에 넣을 값 : 3
			배열 3번째 인덱스에 넣을 값 : -3
			배열 4번째 인덱스에 넣을 값 : 2
			4 -4 3 -3 2
			총 합 : 2
		 * */
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int input2 = sc.nextInt();
			arr [i] = input2;
			sum += input2;
		}
		
		for(int x = 0 ; x < arr.length ; x++) {
			System.out.print(arr[x] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice7(){
		/*주민등록번호 번호를 입력 받아 
		 * 성별을 나타내는 숫자 이후부터 *로 가리고 
		 * 출력하세요.

		[실행 화면]
		주민등록번호(-포함) : 123456-1234567
		123456-1******
		 * */
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
		char[] arr = new char[14];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = input.charAt(i);
			
			if(i >= 8) {
				arr[i] = '*';
		}
			System.out.print(arr[i]);
		}
		
		
		
	}
	
	public void practice8(){
		/*3이상인 홀수를 입력 받아 
		 * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
			중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 
			출력하세요.
			단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
			다시 정수를 받도록 하세요.
			
			[실행 화면]
			정수 : 4
			다시 입력하세요.
			정수 : -6
			다시 입력하세요.
			정수 : 5
			1, 2, 3, 2, 1
			0  1  2  3  4
			         1  3
			
 			1 2 3 4 3 2 1
 			0 1 2 3 4 5 6
 			        1 3 5
		 * */
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		while(input % 2 == 0 || input < 3) {
			
			System.out.println("다시 입력하세요.");
			
			System.out.print("정수 : ");
			int input2 = sc.nextInt();
			input = input2;
			
		}
		
		int[] arr = new int[input];
		int x = -1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(input / 2 >= i) {
				arr[i] = i + 1;
				
			}else {
				arr[i] = i + x;
				x += -2;
			}
			System.out.print(arr[i] + " ");
		}
	
	}
	
	public void practice9(){
		/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
			1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
			
			[실행 화면]
			발생한 난수 : 9 7 6 2 5 10 7 2 9 6
		 * */
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			int random = (int)(Math.random() * 10 + 1);
			
			arr[i] = random;
			
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice10(){
		/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
			1~10 사이의 난수를 발생시켜 배열에 초기화 후
			배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
			
			[실행 화면]
			발생한 난수 : 5 3 2 7 4 8 6 10 9 10
			최대값 : 10
			최소값 : 2
		 * */
		
		int[] arr = new int[10];
		
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			int random = (int)(Math.random() * 10 + 1);
			
			arr[i] = random;
			
			System.out.print(arr[i] + " ");
			
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++) {
		
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice11(){
		/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
			1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
			
			[실행 화면]
			4 1 3 6 9 5 8 10 7 2
		 * */
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			int random = (int)(Math.random() * 10 + 1);
			
			arr[i] = random;
			
			for(int x = 0; x < i ; x++) {

				if(random == arr[x]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}
	
	public void practice12(){
		/*로또 번호 자동 생성기 프로그램을 만들기.
			(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
			
			[실행 화면]
			3 4 15 17 28 40
		 * */
		
		int[] arr = new int[6];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			int random = (int)(Math.random() * 45 + 1);
			
			arr[i] = random;
			
			for(int x = 0; x < i ; x++) {
				
				if(arr[x] == random) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13(){
		/*문자열을 입력 받아 
		 * 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
			문자의 개수와 함께 출력하세요.
			
			[실행 화면]
			문자열 : application
			문자열에 있는 문자 : a, p, l, i, c, t, o, n
			문자 개수 : 8
		 * */
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		
		char[] arr = new char[input.length()];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = input.charAt(i);
		}
		
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0 ; i < arr.length ; i++) {
		
			boolean flag = true; // 중복 체크용 flag 변수
			
			// 중복값이 있는지 검사하는 for
			
			for(int j = 0 ; j < i ; j++) {
				
				if(arr[i] == arr[j]) {
					flag = false; // 중복 발생했을 때
					break;
				}
			}
			
			if(flag) { // 중복이 발생하지 않았을 경우
				
				//if문
				if(i == 0) { // 첫번째 글자
					System.out.print(arr[i]);
				}else { // 0번 인덱스가 아닌 글자
					System.out.print(", " + arr[i]);
				}
				
				count++; // 중복 아닐때만 count 갯수 늘리기
				
			}
			
		}
		
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
	}
	
	public void practice14(){
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
		
		//1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거
		
		String[] arr = new String[size];
		
		
		//2. 첫 배열에 저장할 문자열 입력받기
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		
		//3. 반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서 break;
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);
			
			//4. 값을 더 입력할 경우
			if(ch == 'y' || ch == 'Y') {
				
				// 5. 더 입력 받을 개수 입력하기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); //  입력버퍼에 남은 개행문자 제거
				
				// 6. 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];
				
				// 7. 배열 복사 + 새로운 문자열 입력받기
				for(int i = 0 ; i < newArr.length ; i++) {
					
					if(i < arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 (깊은 복사)
						newArr[i] = arr[i]; // 기존 배열 요소 값 복사
						
					}else {// 인덱스의 크기가 기존 배열보다 클 경우 (새로운 값 입력받기)
						System.out.print((i + 1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
						
				}
				
				// 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입 (얕은 복사)
				// 더 입력? y
				// 위 코드를 반복할때 기존 배열인 arr의 길이를 기준으로 
				//새 배열(newArr)의 크기를 할당하기 때문에
				arr = newArr;
				
			}else if ( ch == 'n' || ch == 'N') { // 값을 더 입력하지 않을 경우
				break; // while 반복문 종료
				
			}else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		
		// 10. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));
		
	}
	
}
