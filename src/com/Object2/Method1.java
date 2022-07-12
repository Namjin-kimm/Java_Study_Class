package com.Object2;

public class Method1 {
	
	//맴버 변수 선언 공식
	//접근지정자 [그외지정자] 데이터타입 변수명;
	//[] : 옵션이라는 의미(선생님이 정한 것)
	
	//멤버 메서드 선언 공식
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){
	//		실행할 코드 작성
	//}
	
	// 접근지정자 : public
	// 그외지정자 : 생략
	// 리턴타입 : void
	// 메서드명 : 각자 알아서 생성, 첫글자는 소문자 시작
	// 매개변수 : 생략
	public void test() {
		System.out.println("Test Method 실행");
		int num = 10;
		System.out.println(num);
	}
	// 맴버메서드 이다.

}

