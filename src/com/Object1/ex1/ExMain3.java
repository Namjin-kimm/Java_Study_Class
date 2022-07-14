package com.Object1.ex1;

import java.util.Scanner;

public class ExMain3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		
		for(int i = 0; i < students.length; i++) {
			Student student = new Student();
			students[i] = student;
			System.out.println("이름 입력");
			students[i].setName(sc.next());
		}
		
		for(int i = 0; i < students.length; i++) {
			students[i].getName();
		}

	}

}
