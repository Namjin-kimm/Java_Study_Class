package com.Object3;

import java.util.Random;
import java.util.Scanner;

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
	
	//makeAccount
	//title, host, 통장번호, 잔액 입력받아서 리턴
	
	public void makeAccount(Account ac) {
		//ac = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("통장 이름을 입력하세요");
		ac.title = sc.next();
		System.out.println("예금주 성함을 입력하세요");
		ac.host = sc.next();
		System.out.println("통장 번호를 입력하세요");
		ac.numbers = sc.next();
		System.out.println("잔액을 입력하세요");
		ac.balance = sc.nextLong();
		
		//return ac;
		
	}
	
	public Account makeAccount1() {
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		account.title = "ss";
		account.host = "ss";
		account.numbers = "11";
		account.balance = 500L;
		
		return account;
	}
}
