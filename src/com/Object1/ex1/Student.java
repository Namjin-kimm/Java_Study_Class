package com.Object1.ex1;

public class Student {
	
	String name;
	int backNum;
	int kors;
	int engs;
	int maths;
	int sum;
	double avg;
	
	public void setTotal() {
		this.sum = this.kors + this.engs + this.maths;
		System.out.println();
		//System은 class, out은 소문자인데 소괄호가 없으므로 변수, println은 소괄호가 있으므로 메서드
		this.setAvg();
		//다른 메서드를 호출할 수 있다
		
	}
	
	public void setAvg() {
		this.avg = this.sum/3.0;
	}

}
