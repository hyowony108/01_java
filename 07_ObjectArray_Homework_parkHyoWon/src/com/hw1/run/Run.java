package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각
		// 이용하여 객체 생성 후 출력
		Employee empArr[] = new Employee[3];
	
		empArr[0] = new Employee();
		empArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		empArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int j = 0 ; j < empArr.length ; j++) {
			System.out.println("emp[" + j + "] : " + empArr[j].information());
		}
		
		System.out.println("==================================================================");
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
		
		empArr[0].setEmpNo(0);
		empArr[0].setEmpName("강말똥");
		empArr[0].setDept("영업부");
		empArr[0].setJob("팀장");
		empArr[0].setAge(30);
		empArr[0].setGender('M');
		empArr[0].setSalary(3000000);
		empArr[0].setBonusPoint(0.2);
		empArr[0].setPhone("01055559999");
		empArr[0].setAdress("전라도 광주");

		empArr[1] = new Employee(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
		
		for(int j = 0 ; j < 2 ; j++) {
			System.out.println("emp[" + j + "] : " + empArr[j].information());
		}
		
		
		/*for(int i = 0 ;  i < 2 ; i++) {
			System.out.printf("emp[%d] : %d, %s, %s, %s, %d, %c, %d, %.1f, %s, %s\n",
					i, empArr[i].getEmpNo(), empArr[i].getEmpName(), empArr[i].getDept(),
					empArr[i].getJob(), empArr[i].getAge(), empArr[i].getGender(),
					empArr[i].getSalary(), empArr[i].getBonusPoint(), empArr[i].getPhone(),
					empArr[i].getAdress());
		}*/
		
		System.out.println("==================================================================");
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 연봉 = (급여 + (급여 * 보너스포인트)) * 12
		
		
		int year = 0;
		int sum = 0;
		
		for(int s = 0 ; s < empArr.length ; s++) {
			year = (int)(empArr[s].getSalary() + empArr[s].getSalary() * empArr[s].getBonusPoint()) * 12;
			sum += year;
			System.out.printf("%s의 연봉 : %d원\n", empArr[s].getEmpName(), 
					year );
			
		}
		
		System.out.println("==================================================================");
		// 3명의 직원의 연봉 평균을 구하여 출력
	
		System.out.println("직원들의 연봉의 평균 :" + sum/empArr.length + "원");
	}

}
