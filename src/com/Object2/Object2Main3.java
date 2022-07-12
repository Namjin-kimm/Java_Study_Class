package com.Object2;

import java.util.Scanner;

public class Object2Main3 {

	public static void main(String[] args) {
		Method3 mt3 = new Method3();
		//월급 입력
		int salary = 5000000; //인자값
		
		mt3.sal(salary); //여기는 5000000라는 값을 보내는 것
		System.out.println(salary);
		//mt3.hap(10, 1);
		System.out.println(salary);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("메일을 입력하세요");
		String mail = sc.next();
		mt3.info(name, age, mail);
		
		Member member = new Member();
		member.name = "iu";
		member.age = 30;
		member.mail = "iu@naver.com";
		mt3.info2(member);
			
	}

}
