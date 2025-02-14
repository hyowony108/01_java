package edu.kh.cotrol.practice;

import java.util.Scanner;

public class ConditionPractice2 {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice5() {
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
		
		// 복합대입 연산자 사용
		
		//중간고사, 기말고사, 과제점수, 출석횟수를 '입력'하고
		System.out.print("중간 고사 점수 : " );
		double midScore = sc.nextDouble();
		//중간 고사 점수(20) : 16.0 -> 실수로 나와야 하기 때문에 double로 받는다
		
		System.out.print("기말 고사 점수 : " );
		double giScore = sc.nextDouble();
		
		System.out.print("과제 점수 : " );
		double homeScore = sc.nextDouble();
		
		System.out.print("출석 횟수 : " );
		double inScore = sc.nextDouble();
		
		// 복합대입 연산자를 사용해서 평가 비율 점수를 구한다
		midScore *= 0.2;
		giScore *= 0.3;
		homeScore *= 0.3;
		
		double finScore = midScore + giScore + homeScore + inScore;
		//총점
		
		System.out.println("================= 결과 =================");
		// 점수 입력 이후 결과 표시가 먼저 출력됨
		
		//전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		if(inScore >= 20 * 0.7) { // 강의의 70퍼센트 이상 출석을 했을 경우
			System.out.printf("중간 고사 점수(20) : %.1f\n", midScore);
			System.out.printf("기말 고사 점수(30) : %.1f\n", giScore);
			System.out.printf("과제 점수(30) : %.1f\n", homeScore);
			System.out.printf("출석 점수(20) : %.1f\n", inScore);
			System.out.printf("총점 : %.1f\n", finScore);
			// fail 이어도 점수는 출력됨
			
			if(finScore >= 70) { // 총점이 70점 이상인 경우 -> Pass
				System.out.println("PASS");
			}else {// 총점이 70점 이상이 아닌 경우 == 70점 미만인 경우
				System.out.println("Fail [점수 미달]");
			}
			
		}else { // 출석률 30% 미달
			System.out.println("Fail [출석 횟수 부족 (" + (int)inScore + "/20)]");
			// 출석횟수는 정수로 나오니까 강제 형변환
		}
	}

}
