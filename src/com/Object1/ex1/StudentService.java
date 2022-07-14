package com.Object1.ex1;

import java.util.Scanner;

public class StudentService {
	
	//makeStudents
	//학생수를 입력 받고,
	//학생수만큼 정보를 입력 받고(이름 번호 국어 영어 수학)
	//학생들을 리턴
	
	Scanner sc;
	Student std;
	//모든 메서드에서 사용하고 싶다면 이 Class의 멤버변수로 선언을 해주면 된다
	
	public StudentService() {
		sc = new Scanner(System.in);
	}
	//이 기본 생성자를 어차피 사용하기 때문에 이 안에 스캐너의 객체를 생성해서 사용하자
	
	
	public Student [] makeStudents() {
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		Student [] stds = new Student[count]; 
		for(int i = 0; i < count; i++) {
			std = new Student();
			stds[i] = std;
			System.out.println("이름을 입력하세요");
			std.setName(sc.next());
			System.out.println("번호를 입력하세요");
			std.setBackNum(sc.nextInt());
			System.out.println("국어 점수를 입력하세요");
			std.setKors(sc.nextInt());
			System.out.println("영어 점수를 입력하세요");
			std.setEngs(sc.nextInt());
			System.out.println("수학 점수를 입력하세요");
			std.setMaths(sc.nextInt());
			stds[i].setTotal();
			//stds[i].sum = stds[i].kors + stds[i].engs + stds[i].maths;
			//stds[i].avg = stds[i].sum/3.0;
			//std.setTotal();
			
		}
		return stds;
		
	}
	
	//findStudent
	//검색하고 싶은 학생의 번호를 입력받아서,
	//같은 번호의 학생을 찾아서 그 학생한명을 리턴
	//없으면 null을 리턴
	
	public Student findStudent(Student [] stds) {
		System.out.println("학생의 번호를 입력하세요");
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		Student std = new Student();
		std = null;
		for(int i = 0; i < stds.length; i++) {
			if(num == stds[i].getBackNum()) {
				std = stds[i];
			}
		}
		return std;
	}
	
	//addStudent
	//학생들의 정보를 받아서
	//학생 한 명 추가
	//추가 완료된 학생 정보들을 리턴
	
	public Student [] addStudent(Student [] stds) {
		Student [] stdsCopy = new Student[stds.length + 1];
		int i = 0;
		for(i = 0; i < stds.length; i++) {
			stdsCopy[i] = stds[i];
		}
		std = new Student();
		stdsCopy[i] = std;
		System.out.println("학생의 정보를 입력");
		System.out.println("학생의 이름");
		std.setName(sc.next());
		System.out.println("학생의 번호");
		std.setBackNum(sc.nextInt());
		System.out.println("학생의 국어 점수");
		std.setKors(sc.nextInt());
		System.out.println("학생의 영어 점수");
		std.setEngs(sc.nextInt());
		System.out.println("학생의 수학 점수");
		std.setMaths(sc.nextInt());
		stdsCopy[i].setTotal();
		
		return stdsCopy;
		
	}
	
	//removeStudent
	//학생들의 정보를 받아서
	//삭제하려는 학생의 번호를 입력 받음
	//학생의 번호와 일치하는 학생을 삭제
	//남은 학생들의 정보를 리턴
	
	public void removeStudent(Student [] stds) {
		System.out.println("정보를 삭제하려는 학생의 번호를 입력하세요");
		int a =sc.nextInt();
		Student [] stdsCopy = new Student[stds.length - 1];
		for(int i = 0; i < stds.length; i++ ) {
			if(a == stds[i].getBackNum()) {
				continue;
			}
			stdsCopy[i] = stds[i];
		}
	}

}
