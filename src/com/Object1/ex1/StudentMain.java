package com.Object1.ex1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		StudentController sc = new StudentController();
		//여기서 StudentController();는 메서드이다.
		sc.start();
			
		System.out.println("프로그램 종료");
	}
			

		
		
}


