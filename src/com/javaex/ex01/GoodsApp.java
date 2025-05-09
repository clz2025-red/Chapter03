package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		//모든 클래스의 부모는 Object 클래스 이다
		Goods camera = new Goods();
		camera.hashCode();  //내가 만든 메소드가 아님
		                    //부모 Object클래스의 메소드
		
		
		Object obj = new Object();
		System.out.println(obj.getClass()); 	//class java.lang.Object    클래스정보
		System.out.println(obj.toString()); 	//java.lang.Object@28a418fc 출력정보
		System.out.println(obj.hashCode()); 	//681842940                 당분간주소라고 생각하자 0x333
		System.out.println(obj.equals(camera)); //false                     두개가 같냐?

		
		
	}

}
