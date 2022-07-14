package com.Object1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		Student student = new Student();
		
		for(int i = 0; i < students.length; i++) {
			student.setName(sc.next());
			students[i] = student;
		}
		
		for(int i = 0; i < students.length; i++) {
			students[i].getName();
		}
		
		
		System.out.println("프로그램 종료");
	}

}
