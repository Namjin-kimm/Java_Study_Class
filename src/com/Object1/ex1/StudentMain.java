package com.Object1.ex1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//StudentController의 start라는 메서드 호출
		
		StudentController sc1 = new StudentController();
		boolean check = true;
		while(check) {
			sc1.start();
			System.out.println("선택해주세요");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("1번");
				}else if(select == 2){
				System.out.println("2번");
				}else if(select == 3){
				System.out.println("3번");
				}else if(select == 4){
				System.out.println("4번");
				}else if(select == 5){
				System.out.println("5번");
				}else{
				System.out.println("6번");
				check = !check;
				}
		}
			
		System.out.println("프로그램 종료");
	}
			

		
		
}


