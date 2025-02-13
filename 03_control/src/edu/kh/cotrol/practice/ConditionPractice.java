package edu.kh.cotrol.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		/*키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		짝수가 아니면 “홀수입니다.“를 출력하세요.
		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		[실행 화면 1]
		숫자를 한 개 입력하세요 : 8
		짝수입니다.
		
		[실행 화면 2]
		숫자를 한 개 입력하세요 : 17
		홀수입니다.
		
		[실행 화면 3]
		숫자를 한 개 입력하세요 : -3
		양수만 입력해주세요.
		 * */
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		String res;
		
		if(num < 0) {
			res = "양수만 입력해주세요.";
			
		}else if(num % 2 == 0) {
			res = "짝수입니다.";
					
			
			}else {
				res = "홀수입니다.";
			}
		System.out.println(res);
	} 

	public void practice2(){
		/*국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		
		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		[실행화면 1] 			[실행화면 2]
		국어점수 : 88 			국어점수 : 88
		수학점수 : 50 			수학점수 : 50
		영어점수 : 40 			영어점수 : 45
		불합격입니다. 			국어 : 88
								수학 : 50
								영어 : 45
								합계 : 183
								평균 : 61.0
								축하합니다, 합격입니다!
			
								
		 * */
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int num = kor + mat + eng;
		double avr = (kor + mat + eng) / 3;
		
		String result;
		
		if(kor < 40 || mat < 40 || eng <40 || avr < 60) {
			result = "불합격입니다.";
		}else {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + mat);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + num);
			System.out.println("평균 : " + avr);
			result = "축하합니다, 합격입니다!";
		}
		
		System.out.println(result);
	}

	public void practice3(){
		/*1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
		잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
		
		[실행화면 1]
		1~12 사이의 정수 입력 : 8
		8월은 31일까지 있습니다.
		[실행화면 2]
		1~12 사이의 정수 입력 : 99
		99월은 잘못 입력된 달입니다.
		 * */
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		// month > 0 && month < 13
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.println(month + "월은 31일까지 있습니다."); break;
		case 2 : case 4 : case 6 : case 9 : case 11 : 
			System.out.println(month + "월은 30일까지 있습니다."); break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}

	public void practice4(){
		/*키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		저체중/정상체중/과체중/비만을 출력하세요.
		
		BMI = 몸무게 / (키(m) * 키(m))
		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		BMI가 30이상일 경우 고도 비만
		
		[실행 화면]
		키(m)를 입력해 주세요 : 1.65
		몸무게(kg)를 입력해 주세요 : 58.4
		BMI 지수 : 21.45087235996327
		정상체중
		 * */
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double tall = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double ki = sc.nextDouble();
		
		double bmi = ki / (tall * tall);
		System.out.println("BMI 지수 : " + bmi);
		
		String res;
		
		if(bmi < 18.5) {
			res = "저체중";
		}else if(bmi < 23) {
			res = "정상체중";
		}else if(bmi < 25) {
			res = "과체중";
		}else if(bmi < 30) {
			res = "비만";
		}else {
			res = "고도 비만";
		}
		
		System.out.println(res);
	}

	public void practice5(){
		/*중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
		[실행 화면 1]
		중간 고사 점수 : 80
		기말 고사 점수 : 30
		과제 점수 : 60
		출석 횟수 : 18
		================= 결과 =================
		중간 고사 점수(20) : 16.0
		기말 고사 점수(30) : 9.0
		과제 점수 (30) : 18.0
		출석 점수 (20) : 18.0
		총점 : 61.0
		Fail [점수 미달]
		 * */
		
		System.out.print("중간 고사 점수 : ");
		int s = sc.nextInt();
		//double s = sc.nextDouble 처음부터 더블로 받으면 나중에 안고쳐도 됨
		
		System.out.print("기말 고사 점수 : ");
		int s2 = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int con = sc.nextInt();
		
		// 각각의 점수를 비율에 맞게 변경
		// s *= 0.2; 복합대입 연산자 사용
		// 만약 int로 변수를 저장할 시 s *= 0.2; 는 오류가 나지 않지만
		// s = s * 0.2; 는 오류가 발생함
		//-> 복합대입 연산자는 자동 형변환이 발생해서 오류 안남
		
		String score;
		double sScore = s * 0.2;
		double s2Score = s2 * 0.3;
		double hwScore = hw * 0.3;
		double finScore = sScore + s2Score + hwScore + con;
		
		int f = 20 - con;
		
		System.out.println("================= 결과 =================");
		 
		if(f >= con - 20 * 0.3) {
			// (con  <= 20 * 0.7) 출석률 70%보다 높을 때 라는 의미 레전드
			score = "Fail [출석 횟수 부족 (" + con + "/20)]";
			// 변수 선언을 double로 했을 시 강제 형변환 (int)con 해야함
			
		}else {
			if(finScore < 70) {
				score = "Fail [점수 미달]";
			}else {
				score = "Pass";
			}
			System.out.println("중간 고사 점수(20) : " + sScore);
			System.out.println("기말 고사 점수(30) : " + s2Score);
			System.out.println("과제 점수 (30) : " + hwScore);
			System.out.println("출석 점수 (20) : " + (float)con);
			System.out.println("총점 : " + finScore);
			
			/*
			 * System.out.printf("중간 고사 점수(20) : %.1f \n", sScore);
				System.out.printf("기말 고사 점수(30) : %.1f \n" , s2Score);
				System.out.printf("과제 점수 (30) : %.1f \n" , hwScore);
				System.out.printf("출석 점수 (20) : %.1f \n" , con);
				System.out.printf("총점 : %.1f \n" , finScore);
			 */
		}
		 	
		
		System.out.println(score);
		
	}

}
