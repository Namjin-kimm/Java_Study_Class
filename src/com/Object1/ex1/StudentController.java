package com.Object1.ex1;

import java.util.Scanner;

public class StudentController {
	//start 메서드 선언
	public void start() {
		
		//StudentController의 start라는 메서드 호출
				StudentController sc1 = new StudentController();
				StudentService ss = new StudentService();
				StudentView sv = new StudentView();
				//StudentSearch sc2 = new StudentSearch();
				Student [] stds = null;
				Student std = new Student();
				
				boolean check = true;
				while(check) {
					System.out.println("1. 학생 정보 입력");
					System.out.println("2. 학생 정보 조회");
					System.out.println("3. 학생 정보 검색");
					System.out.println("4. 학생 정보 삭제");
					System.out.println("5. 학생 정보 추가");
					System.out.println("6. 프로그램  종료");
					System.out.println("선택해주세요");
					Scanner sc = new Scanner(System.in);
					int select = sc.nextInt();
					if(select == 1) {
						stds = ss.makeStudents();
						}else if(select == 2){
							sv.view(stds);
							//System.out.println("문자를 입력하세요");
							//String a = sc.next();
							//sv.viewMessage(a);
							
						
						}else if(select == 3){
							//sc2.studentSearch(stds);
							std = ss.findStudent(stds);
							if(std != null) {
							sv.view(std);
							} else {
								String a = "없는 정보입니다";
								sv.view(a);
							}
						}else if(select == 4){
						System.out.println("4번");
						}else if(select == 5){
						System.out.println("5번");
						}else{
						System.out.println("6번");
						check = !check;
						}
				}
	}

	
}
