package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.toyFactory.model.dto.Toy;

public class ToyFactory{

	
	Scanner sc = new Scanner(System.in);
	Set<Toy> toySet = new HashSet<>();
	Map<Integer, String> material = new LinkedHashMap<Integer, String>();
	
public ToyFactory() {
	
	material.put(1, "면직물");
	material.put(2, "플라스틱");
	material.put(3, "유리");
	material.put(4, "고무");

	toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", "면직물", "고무"));
	toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", "면직물", "플라스틱"));
	toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", "면직물", "플라스틱"));
	toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128","면직물", "플라스틱"));
	toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", "면직물", "플라스틱"));

}
	
	public void displayMenu() {
		
		int menu = 0;
		
		do {
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			
			System.out.print("선택 : ");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1: showToy(); break;
			case 2: System.out.println(addToy());break;
			case 3: System.out.println(delToy()); break;
			case 4: showCreateDate(); break;
			case 5: useAge(); break;
			case 6: System.out.println(addMaterials()); break;
			case 7: break;

			default:System.out.println("메뉴에 있는 번호만 입력해주세요"); break;
			}
			
		}while(menu != 0);
		
	}
	
	public void showToy() {
		System.out.println("<전체 장난감 목록>");
		int index = 1;
		
		for(Toy t : toySet) {
			System.out.print(index + ". ");
			System.out.println(t);
			index ++;
		}
	}
	
	public String addToy() {
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String toyName = sc.next();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String createDate = sc.next();
		
		boolean falg = false;
		String res = null;
		
		while(falg == false) {
			res +=  ", ";
			
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요): ");
			String input = sc.next();
			
			if(input.equals("q")) {
				falg = true;
			}
			
			res += input;
		}
			
			

			
		
		
		toySet.add(new Toy(toyName, age, price, color,createDate, res));
		
		return "장난감이 추가되었습니다.";
		
	}
	
	public String delToy() {
		
		System.out.print("삭제할 장난감 이름을 입력하세요. : ");
		String name = sc.next();
		
		for(Toy t : toySet) {
			if(name.equals(t.getToyName())) {
				toySet.remove(t);
				return "장난감이 삭제되었습니다.";
			}
		}
		
		return "입력하신 장난감이 없습니다.";
		
	}
	
	public void showCreateDate() {
		System.out.println("<제조일 순으로 장난감을 정렬>");
		
		
		Set<String> date = new TreeSet<>();
		
		for(Toy t : toySet) {
			date.add(t.getCreateDate());
		}
		
		List<String> showDate = new ArrayList<>(date);
		
		for(int i = 0 ; i < showDate.size(); i++) {
			
			for(Toy t : toySet) {
				if(showDate.get(i).equals(t.getCreateDate())) {
					
					System.out.println(t);
				}
				
			}
			
		}
	}
	
	public void useAge() {
		
		System.out.println("<연령별 사용 가능한 장난감>");
		
		Set<Integer> age = new TreeSet<>();
		
		for(Toy t : toySet) {
			age.add(t.getAge());
		}
		
		List<Integer> useAge = new ArrayList<>(age);
		
		for(int i = 0 ; i < useAge.size() ; i++) {
			
			System.out.println("[연령 : " + useAge.get(i) + "세]");
			int num = 1;
			
			for(Toy t : toySet) {
				
				if(useAge.get(i) == t.getAge()) {
					System.out.print(num + ". ");
					System.out.println(t);
					num++;
				
				}
				
			}
			
			
		}
		
		
	}
	
	public String addMaterials() {
		// 가변인자 사용
		System.out.println("<재료추가>");
		System.out.println("==현재 등록된 재료==");
		
		for(int i = 1; i <= material.size(); i++) {
			System.out.println(i + ": " + material.get(i));
		}
		
		System.out.println("---------------------------------------");
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
	
		System.out.print("재료명 입력 : ");
		String mat = sc.next();
		
		if(material.containsKey(key)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N): ");
			char ans = sc.next().toUpperCase().charAt(0);
				
			if(ans == 'Y') {
				material.put(key, mat);
			} 
			
			return "재료가 성공적으로 덮어쓰기 되었습니다.";
			
			}else {
				material.put(key, mat);
				
				return "새로운 새료가 성공적으로 등록되었습니다.";
		}
			
		
	
	
	
	
	
	
	
	}

	public void delMaterials() {
		System.out.println("<재료 삭제>");
		System.out.println("==현재 등록된 재료==");
		
		for(int i = 1; i <= material.size(); i++) {
			System.out.println(i + ": " + material.get(i));
		}
		
		System.out.println("---------------------------------------");
		
		System.out.print("재료명 입력 : ");
		String mat = sc.next();
		
		if(material.containsValue(mat)) {
			
		}
	}



}
