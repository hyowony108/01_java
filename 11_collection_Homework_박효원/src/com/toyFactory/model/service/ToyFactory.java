package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.toyFactory.model.dto.Toy;

public class ToyFactory{

	
	Scanner sc = new Scanner(System.in);
	Set<Toy> toySet = new HashSet<>();
	Map<Integer, String> materialMap = new LinkedHashMap<Integer, String>();
	
public ToyFactory() {
	
	materialMap.put(1, "면직물");
	materialMap.put(2, "플라스틱");
	materialMap.put(3, "유리");
	materialMap.put(4, "고무");

	toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
	toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1, 2)));
	toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)));
	toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128",addMaterials(1, 2)));
	toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));

}
	
	/**
	 * 매개변수로 전달받은 값들을 재료저장 Map에 있는지 확인하고 Set형태로 반환하는 메서드
	 * 
	 * 가변인자 작성법 : 자료형...변수명 -> 매개변수의 수가 정확히 몇개인지 특정할 수 없을 때 사용
	 * 
	 * @return
	 */
	public Set<String> addMaterials(Integer...material){
		
		// 매개변수로 전달받은 재료를 저장하여 반환할 Set객체를 생성
		Set<String> addedMaterials = new HashSet<>();
		
		for(Integer materialKey : material) {
			
			// Map에서 재료 고유 번호(key)에 대응하는 재료명(value)을 가져와서
			// addedMaterials에 추가
			String materialValue = materialMap.get(materialKey);

			// map에 없는 key를 입력하여 value를 얻어왔을 때 == null

			if(materialValue != null) {
				addedMaterials.add(materialValue);
			}
		}
		return addedMaterials;
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
			
			try {
				
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
				
			}catch(Exception e) {
				
				System.out.println("알맞은 입력을 해라..");
				e.printStackTrace();
				
				sc.nextLine();
				
			}
			
		}while(menu != 0);
		
	}
	
	public void showToy() {
		System.out.println("\n<전체 장난감 목록>");
		
		if(toySet.isEmpty()) {
			System.out.println("생성된 장난감이 없습니다.");
			return;
		}
		
		int index = 1;
		
		for(Toy t : toySet) {
			System.out.print(index + ". " + t);
			index ++;
		}
	}
	
	public String addToy() {
		
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String toyName = sc.next();
		
		for(Toy existingToy : toySet) {
			
			if(existingToy.getToyName().equals(toyName)) {
				System.out.println("이미 같은 이름을 가진 장난감이 있습니다.");
				break;
			}
		}
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String createDate = sc.next();
		
		Set<String> materials = new HashSet<String>(); // 재료를 저장할 Set객체 생성
		
		System.out.println("사용 가능한 재료 목록");
		
		// Entry.getKey() : Entry 객체의 key 반환
		// Entry.getValue() : Entry 객체의 value 반환
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			// 1 : 면직물
			// 2 : 플라스틱
			// 3 : 유리
			// 4 : 고무
		}
		
		while(true) {
			System.out.print("추가할 재료의 번호를 입력하세요 (종료하려면 'q'를 입력하세요) : ");

			try {
				
				String input = sc.next();
				
				if(input.equals("q")) {
					break;
				}
				
				// String 형인 input을 int형 정수값으로 변환(Integer Wrapper 클래스 이용)
				int materialKey = Integer.parseInt(input); // "1" -> 1 
				// NumberFormatException 발생 가능성 있음 : 문자열(String)을 숫자로 변환하려고 할 때, 변환이 불가능한 경우 발생
				String material = materialMap.get(materialKey); // "면직물"
				// 입력받은 재료고유번호(key)로
				// map에 저장된 재료명(value)를 얻어옴
				
				if(material != null) {
					
					// materials Set 객체에 해당 재료명이 존재하는지
					if(materials.contains(material)) {
						System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요.");
					} else {
						materials.add(material);
						System.out.println("재료가 추가되었습니다 : " + material);
					}
				} else {
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				}
			
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하거나 q를 입력하세요.");
			}
		}
		
		toySet.add(new Toy(toyName, age, price, color,createDate, materials));
		return "새로운 장난감이 추가되었습니다.";
	
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
		
		 if(toySet.isEmpty()) {
			 System.out.println("생성된 장난감이 없습니다.");
			 return;
		 }
		
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

	public void displayToysByManufactureDate() {
		System.out.println("\n<제조일 순으로 장난감을 정렬>");
		
		 if(toySet.isEmpty()) {
			 System.out.println("생성된 장난감이 없습니다.");
			 return;
		 }
		 
		 List<Toy> toyList = new ArrayList<Toy>(toySet);
		 
		 // 제조일 오름차순으로 정렬하기 위한 Comparator 구현 내부 클래스
		 Collections.sort(toyList, new Comparator<Toy>() {

			@Override
			public int compare(Toy o1, Toy o2) {
				// 문자열끼리 비료 compareTo 사용
				return o1.getCreateDate().compareTo(o2.getCreateDate());
			}
			 
		 });
		 
		 int index = 1;
		 for(Toy t : toyList) {
			 System.out.println(index + ". " + t);
			 index++;
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
					System.out.println(num + ". " + t);
					num++;
				
				}
				
			}
			
			
		}
		
		
	}
	
	public String addMaterials() {
		System.out.println("<재료추가>");
		System.out.println("==현재 등록된 재료==");
		
		for(int i = 1; i <= materialMap.size(); i++) {
			System.out.println(i + ": " + materialMap.get(i));
		}
		
		System.out.println("---------------------------------------");
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
	
		System.out.print("재료명 입력 : ");
		String mat = sc.next();
		
		if(materialMap.containsKey(key)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N): ");
			char ans = sc.next().toUpperCase().charAt(0);
				
			if(ans == 'Y') {
				materialMap.put(key, mat);
			} 
			
			return "재료가 성공적으로 덮어쓰기 되었습니다.";
			
			}else {
				materialMap.put(key, mat);
				
				return "새로운 새료가 성공적으로 등록되었습니다.";
		}
			
		
	
	
	
	
	
	
	
	}

	public void delMaterials() {
		System.out.println("<재료 삭제>");
		System.out.println("==현재 등록된 재료==");
		
		for(int i = 1; i <= materialMap.size(); i++) {
			System.out.println(i + ": " + materialMap.get(i));
		}
		
		System.out.println("---------------------------------------");
		
		System.out.print("재료명 입력 : ");
		String mat = sc.next();
		
		boolean flag = false;
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			if(entry.getValue().equals(mat)) {
				materialMap.remove(entry.getKey());
				
				System.out.println("재료 '" + mat + "' 가 성공적으로 제거되었습니다.");
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
	}



}
