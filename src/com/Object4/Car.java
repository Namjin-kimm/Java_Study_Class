package com.Object4;

public class Car {
	
	String company = "쌍용";
	String brand;
	String color;
	boolean gear; //true 오토, false 수동
	
	//Instance 초기화 블럭 {}
	{
		this.company = "기아";
		this.brand = "K5";
		this.color = "Black";
		this.gear = false;
	}
	
	public void info() {
		System.out.println("Company : " + this.company);
		System.out.println("Brand : " + this.brand);
		System.out.println("Color : " + this.color);
		System.out.println("Gear : " + this.gear);
	}
	
	public Car(String color) {
		this("아반떼", color); //이 생성자에서 다른 생성자를 호출할 떄 사용하는 방법 this();
		this.company = "현대";
		this.brand = "아반떼";
		this.color = "White";
		this.gear = true;
	}
	
	public Car(String brand, String color) {
		this.company = "현대";
		this.brand = brand;
		this.color = color;
		this.gear = true;
		//기본 생성자를 만들면 흰색이 나오고, 우리가 선언한 메서드를 만들면 우리가 원하는 색깔이 나온다
	}

}
