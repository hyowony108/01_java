package edu.kh.practice2.snack.controller;

import edu.kh.practice.snack.model.vo.Snack;


//Controller : 사용자의 요청을 받아서 처리하고, 그 입력에 따라
//				Model(데이터처리, 비즈니스 로직)과 View(화면 출력)를 연결해주는 역할
public class SnackController {

	private Snack s = new Snack();
	
	public SnackController() {
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료되었습니다.";
	}
	
	public String confirmDate() {
		return s.information();
	}
}
