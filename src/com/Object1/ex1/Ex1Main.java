package com.Object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//Student student = new Student();
		//student.name = "김남진";
		//student.backNum = 20;
		//student.kors = 74;
		//student.engs = 77;
		//student.maths = 33;
		//student.sum = student.kors + student.engs + student.maths;
		//student.avg = student.sum/3.0;
		
		//System.out.println(student.name);
		//System.out.println(student.sum);
		//=========================================================
		//Student student1 = new Student();
		//Student student2 = new Student();
		
		
		Student student;
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		int i = 0;
		for(i = 0; i < 3; i++) {
			student = new Student();
			System.out.println("이름 입력");
			student.name = sc.next();
			students[i] = student;
			System.out.println(i);
		}
		System.out.println(i);
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		System.out.println(students[2].name);
		
		System.out.println("프로그램 종료");
	}

}
