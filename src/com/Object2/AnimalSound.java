package com.Object2;

public class AnimalSound {
	
	public void dogSound() {
		System.out.println("멍멍");
		catSound();
		dogSound();
	}
	
	public void catSound() {
		System.out.println("냥냥");
	}
	
	public void tigerSound() {
		System.out.println("어흥");
		dogSound();
	}

}
