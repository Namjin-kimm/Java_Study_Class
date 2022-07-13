package com.Object1.ex1;

import java.util.Scanner;

public class StudentSearch {
	
	public void studentSearch(Student [] stds) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 번호를 입력해주세요");
		int num = sc.nextInt();
		boolean flag = true;
		for(int i=0;i<stds.length;i++) {
			if(num == stds[i].backNum) {
				System.out.println("Name\tNum\tKor\tEng\tMath\tTotal\tAvg");
				System.out.println(stds[i].name+"\t"+stds[i].backNum
				+"\t"+stds[i].kors+"\t"+stds[i].engs+"\t"+stds[i].maths+"\t"
				+stds[i].sum+"\t"+stds[i].avg);
				flag=!flag;
				break;
				}
		}
		
		if(flag) {
			System.out.println("일치하는 학생 정보 없음");
		}
		
	}
}
