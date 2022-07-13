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
		
		//매개변수를 사용하는 방법
		Account ac = new Account();
		rt.makeAccount(ac);
		System.out.println("통장 이름 : " + ac.title);
		System.out.println("예금주 : " + ac.host);
		System.out.println("통장 번호 : " + ac.numbers);
		System.out.println("통장 잔액 : " + ac.balance);
		
		//Return하는 방법
		Account account = rt.makeAccount1();
		System.out.println("통장 이름 : " + account.title);
		System.out.println("예금주 : " + account.host);
		System.out.println("통장 번호 : " + account.numbers);
		System.out.println("통장 잔액 : " + account.balance);
	}

}
