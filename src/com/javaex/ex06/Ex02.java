package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg ";
		
		/*
		System.out.println(a+b);
		System.out.println(a.concat(b));   //a문자열에 b문자열을 합쳐라
		
		System.out.println(b+a);
		System.out.println(b.concat(a));   //b문자열에 a문자열을 합쳐라
		*/
		
		//실험을위해서 a값을 바꾼다
		a = a.concat(b);                   //문자열을 합친다. 
		System.out.println(a);
		
		a = a.trim();                      //a의 문자열의 좌우 공백을 제거한다
		System.out.println(a);
		
		a = a.replace("ab", "12");             //a의 문자열에서 ab를 12로 바꾼다
		System.out.println(a);
		
		System.out.println("-------------------------------");
		
		String[] sArray = a.split(",");       // a의 문자열을 ","를 기준으로 나누어서 배열에 담는다
		for(int i=0; i<sArray.length; i++) {  // 그리고 배열의 주소를 리턴한다
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		System.out.println("------------------------------");
		
		String str = "Hello JAVA!";
		String result01 = str.substring(3);
		System.out.println(result01);
		
		String result02 = str.substring(1, 7);
		System.out.println(result02);
		
		char c = str.charAt(10);
		System.out.println(c);
		
		

		
	}

}
