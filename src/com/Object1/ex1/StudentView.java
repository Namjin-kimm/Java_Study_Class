package com.Object1.ex1;

import java.util.Scanner;

public class StudentView {
	
	//viewMessage
	//문자열을 받아서 그 문자열을 출력
	
	public void view(String a) {
		System.out.println(a);
	}
	
	//viewOne
	//학생 한 명의 정보를 받아서 모든 정보를 출력
	
	public void view(Student std) {
		System.out.println("이름 : " + std.getName());
		System.out.println("번호 : " + std.getBackNum());
		System.out.println("국어 점수 : " + std.getKors());
		System.out.println("영어 점수 : " + std.getEngs());
		System.out.println("수학 점수 : " + std.getMaths());
		System.out.println("총점 : " + std.getSum());
		System.out.println("평균 점수 : " + std.getAvg());
		
	}
	//viewAll
	//학생들의 정보를 받아서 출력
	
	public void view(Student [] stds) {
		for(int i = 0; i < stds.length; i++) {
			System.out.println("이름 : " + stds[i].getName());
			System.out.println("번호 : " + stds[i].getBackNum());
			System.out.println("국어 점수 : " + stds[i].getKors());
			System.out.println("영어 점수 : " + stds[i].getEngs());
			System.out.println("수학 점수 : " + stds[i].getMaths());
			System.out.println("총점 : " + stds[i].getSum());
			System.out.println("평균 점수 : " + stds[i].getAvg());
		}
	}

}
