package edu.kh.poly.ex1.model.dto;

public class Car /*extends Object*/{

	// 속성
	private String engine;
	private String fuel; // 연료
	private int wheel;
	
	// 기능 ( 생성자 + 메서드 )
	public Car() {}

	public Car(String engine, String fuel, int wheel) {
		super(); // super 생성자 / 부모의 기본 생성자
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	// Object.toString() 오버라이딩
	// 오버라이딩 ?
	// -> 부모클래스에서 정의된 메서드를 자식 클래스에서 재정의 하는 것.
	@Override
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
		// super. 참조변수 : 부모 객체(Object)의 주소값을 가지고 있는 변수
	}
	
}
