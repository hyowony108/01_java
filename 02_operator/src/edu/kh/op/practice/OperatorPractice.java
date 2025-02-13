package edu.kh.op.practice;

import java.util.Scanner;

// 기능 제공용 클래스
public class OperatorPractice {
	
	public void practice1(){
		/*모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		  1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

			[실행화면]
			인원 수 : 29
			사탕 개수 : 100
			1인당 사탕 개수 : 3
			남는 사탕 개수 : 13
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 :");
		int input1 = sc.nextInt(); 
		
		System.out.print("사탕 개수 :");
		int input2 = sc.nextInt(); 
		
		System.out.printf("%s : %d\n", "인원 수", input2 / input1);
		System.out.println("남은 사탕 개수 : " + input2 % input1);
	}

	public void practice2(){
		/*키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.

		ex.
		이름 : 홍길동
		학년(정수만) : 3
		반(정수만) : 4
		번호(정수만) : 15
		성별(남학생/여학생) : 남학생
		성적(소수점 아래 둘째 자리까지) : 85.75
		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String input3 = sc.next();
		
		System.out.print("학년(정수만) :  ");
		int input4 = sc.nextInt();
		
		System.out.print("반(정수만) :  ");
		int input5 = sc.nextInt();
		
		System.out.print("번(정수만) :  ");
		int input8 = sc.nextInt();
		
		sc.nextLine();

		System.out.print("성별(남학생/여학생) : ");
		String input6 = sc.next();
		
		
		System.out.print("성적(소수점 아래 둘째 자리까지) :  ");
		double input7 = sc.nextDouble();
		
		System.out.println();
		
		//System.out.printf("%d%s %d%s %d%s %s %s%s %.2f%s", input4, "학년", input5, "반", input8, "번", input3, input6, "의 성적은",  input7, "이다.");
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", input4, input5, input8, input3, input6, input7);
		
	}

	public void practice3(){
		
		/*국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
			세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
			[실행화면]
			국어 : 60
			영어 : 80
			수학 : 40
			합계 : 180
			평균 : 60.0
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int inpt = sc.nextInt();
		
		System.out.print("영어 : ");
		int inpt2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int inpt3 = sc.nextInt();
		
		int sum = inpt + inpt2 + inpt3;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum );
		System.out.printf("평균 : %.1f\n", avg);
		
		// 각 과목이 40점 이상, 평균 60이상 합격
		// 그 외 불합격 출력
		
		boolean result = (inpt >= 40)&&(inpt2 >= 40)&&(inpt3 >=40) && (avg >= 60);
		
		System.out.println(result ? "합격" : "불합격");
	}
}

	
