package com.Object1;

public class ObjectMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//Object 생성
		//클래스명 변수명 = new 클래스명();
		//변수 선언할 때 : 데이터타입 변수명
		
		Monster monster = new Monster();
		//여기서 Monster는 데이터 타입이다
		//monster를 출력하면 주소가 나온다
		
		System.out.println(monster);
		//멤버변수 접근
		//변수명.멤버명
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		monster.name = "오크";
		monster.hp = 100;
		monster.level = 5;
		
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		//---------------------------------
		
		Monster monster1 = new Monster();
		monster1.name = "오크";
		monster1.hp = 100;
		monster1.level = 5;
		
		System.out.println(monster1.name);
		System.out.println(monster1.level);
		System.out.println(monster1.hp);
		System.out.println(monster == monster1);
		//같지 않다, 위 식은 주소가 같은지 판별하는 식이다
		//내용이 같다고 해도 같지 않다.
		
		Weapon sword = new Weapon();
		sword.name = "단검";
		sword.damage = 10;
		sword.inchant = 1;
		
		monster.weapon = sword;
		//여기서 weapon의 타입은 Weapon 이므로 대입도 Weapon 타입만 할 수 있다
		System.out.println(monster.weapon.name);
		
		System.out.println(monster1.weapon.name);
		
		
		System.out.println("프로그램 종료");
	}

}
