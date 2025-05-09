package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(10);
	
		//클래스명@숫자
		System.out.println(p01.toString());
		
		
		//print(), println()  은 toString() 실행한다
		System.out.println(p01);
		
		System.out.println(p01.getClass());  //클래스 이름
		System.out.println(p01.hashCode());  //당분간 주소라고 생각
		
		System.out.println("--------------------------");

		
		
		
		
	}

}
