package com.javaex.ex06;

public class Ex01 {

	//필드
	//생성자
	//메소드 gs
	
	//메소드 일반
	public static void main(String[] args) {
	
		//우리가 알고 있는 일반적인 규칙
		String s00 = new String("안녕하세요");
		String s01 = new String("안녕하세요");
		//String s01 = "안녕하세요";
		
		System.out.println(s00.toString());
		System.out.println(s01.toString());
		
		System.out.println(s00 == s01);   //== 주소가 같냐?
		System.out.println(s00.equals(s01));  // 글자가 같니?
		System.out.println("---------------------------------------");
		/////////////////////////////////////////
		
		//String 약식으로 사용할때
		//같은 문자열이 있는지 체크한다
		//있으면 새로만들지 않고 같은 곳을 가리킨다
		//-->문자열을 변경하면 같이 변경되어야 한다 --> 이렇게 되면 안된다 
		
		
		String str00 = "hi";
		String str01 = "굿모닝";
		String str02 = "굿모닝";  //str01과 같은 주소
		
		System.out.println(str00.toString());
		System.out.println(str01.toString());
		System.out.println(str02.toString());
		System.out.println("-----------------------------");
		
		System.out.println(str01 == str02);  // 주소가 같음을 확인
		System.out.println(str01.equals(str02));  //값을 비교할때는 equals() 사용
		
		//****문자열을 변경하면 메모리에서는 같이 변경되어야 하나
		//실제로는 따로따로 변경되어야 한다
		
		//약식으로 문자열을 만들고 같은 주소를 갖을경우 값을 변경할수 없다
		//문자열을 변경하면 새로 만든다
		
		str01 = "굿이브닝";
		System.out.println(str01 == str02);  //  주소가 바뀐다 --> 새로만들었다
	
		System.out.println(str01.toString());
		System.out.println(str02.toString());
		
		
	}
	
	
}
