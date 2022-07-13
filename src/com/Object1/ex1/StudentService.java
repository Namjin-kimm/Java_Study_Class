package com.Object1.ex1;

import java.util.Scanner;

public class StudentService {
	
	//makeStudents
	//학생수를 입력 받고,
	//학생수만큼 정보를 입력 받고(이름 번호 국어 영어 수학)
	//학생들을 리턴
	
	public Student [] makeStudents() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		Student [] stds = new Student[count]; 
		for(int i = 0; i < count; i++) {
			Student std = new Student();
			stds[i] = std;
			System.out.println("이름을 입력하세요");
			stds[i].name = sc.next();
			System.out.println("번호를 입력하세요");
			stds[i].backNum = sc.nextInt();
			System.out.println("국어 점수를 입력하세요");
			stds[i].kors = sc.nextInt();
			System.out.println("영어 점수를 입력하세요");
			stds[i].engs = sc.nextInt();
			System.out.println("수학 점수를 입력하세요");
			stds[i].maths = sc.nextInt();
			stds[i].sum = stds[i].kors + stds[i].engs + stds[i].maths;
			stds[i].avg = stds[i].sum/3.0;
			
		}
		return stds;
		
	}
	
	//findStudent
	//검색하고 싶은 학생의 번호를 입력받아서,
	//같은 번호의 학생을 찾아서 그 학생한명을 리턴
	//없으면 null을 리턴
	
	public Student findStudent(Student [] stds) {
		System.out.println("학생의 번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Student std = new Student();
		std = null;
		for(int i = 0; i < stds.length; i++) {
			if(num == stds[i].backNum) {
				std = stds[i];
			}
		}
		return std;
	}

}
