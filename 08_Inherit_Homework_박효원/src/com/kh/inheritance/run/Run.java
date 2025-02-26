package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		// SmartPhone 객체 생성
		
		SmartPhone sp = new SmartPhone("Samsung", "Galaxy s20", 2020, 1200000, "Android", 128);
		
		sp.printInfo();
		
		System.out.println();
		System.out.println("===============================");
		
		// Basic Phone 객체 생성
		
		BasicPhone bp = new BasicPhone("Nokia", "3310", 2000, 100000, false);
		
		bp.printInfo();
		
		if(bp.isHasPhysicalKeyboard() == false) {
			System.out.println();
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		}
	
	}

}
