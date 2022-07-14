package com.Object1.ex1;

import java.util.Scanner;

public class StudentSearch {
	
	public void studentSearch(Student [] stds) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 번호를 입력해주세요");
		int num = sc.nextInt();
		boolean flag = true;
		for(int i=0;i<stds.length;i++) {
			if(num == stds[i].getBackNum()) {
				System.out.println("Name\tNum\tKor\tEng\tMath\tTotal\tAvg");
				System.out.println(stds[i].getName()+"\t"+stds[i].getBackNum()
				+"\t"+stds[i].getKors()+"\t"+stds[i].getEngs()+"\t"+stds[i].getMaths()+"\t"
				+stds[i].getSum()+"\t"+stds[i].getAvg());
				flag=!flag;
				break;
				}
		}
		
		if(flag) {
			System.out.println("일치하는 학생 정보 없음");
		}
		
	}
}
