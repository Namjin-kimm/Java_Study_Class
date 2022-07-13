package com.Object3;

import java.util.Random;

public class ReturnTest {
	
	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);
		
		//return 하려는 Data
		return '3';
	}
	
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}

	
	public int [] makeRandom2(int j) {
		Random random = new Random();
		int [] nums = new int[j];
		
		for(int i = 0; i < j; i++) {
			//int num = random.nextInt(50);
			//nums[i] = num
			nums[i] = random.nextInt(50);
		}
		
		return nums;
	}
}
