package com.Object2;

public class Object2Main4 {

	public static void main(String[] args) {
		Member member = new Member();
		member.name = "김";
		member.age = 30;
		member.mail = "ff";
		
		Member member2 = new Member();
		member2.name = "남";
		member2.age = 29;
		member2.mail = "dd";
		
		Member member3 = new Member();
		member3.name = "진";
		member3.age = 28;
		member3.mail = "aa";
		
		Member [] members = new Member[3];
		members[0] = member;
		members[1] = member2;
		members[2] = member3;
		
		Method4 mt4 = new Method4();
		mt4.info(members);
		
		System.out.println(members.length);

	}

}
