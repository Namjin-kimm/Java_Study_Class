package com.Object1.ex1;

public class Student {
	
	private String name;
	private int backNum;
	private int kors;
	private int engs;
	private int maths;
	private int sum;
	private double avg;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBackNum() {
		return backNum;
	}

	public void setBackNum(int backNum) {
		this.backNum = backNum;
	}

	public int getKors() {
		return kors;
	}

	public void setKors(int kors) {
		this.kors = this.checkPoint(kors);
	}

	public int getEngs() {
		return engs;
	}

	public void setEngs(int engs) {
		this.engs = this.checkPoint(engs);
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = this.checkPoint(maths);
	}

	public int getSum() {
		return sum;
	}


	public double getAvg() {
		return avg;
	}
	
	
	private int checkPoint(int point) {
		if(point < 0 || point > 100) {
			return 0;
		}
		return point;
	}

	
	
	
	public void setTotal() {
		this.sum = this.kors + this.engs + this.maths;
		System.out.println();
		//System은 class, out은 소문자인데 소괄호가 없으므로 변수, println은 소괄호가 있으므로 메서드
		this.setAvg();
		//다른 메서드를 호출할 수 있다
		
	}

	private void setAvg() {
		this.avg = this.sum/3.0;
	}
	

}
