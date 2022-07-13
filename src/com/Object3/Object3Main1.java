package com.Object3;

import java.util.Scanner;

public class Object3Main1 {

	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		rt.info();
		int num = rt.makeRandom();//5
		System.out.println(num);
		
		System.out.println("====================");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int [] nums = rt.makeRandom2(j);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
