package com.javaex.ex02;

public class Point extends Object { //상속생략가능

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
		super(); // Object클래스의 기본생성자 호출 생략가능
	}

	public Point(int x, int y) {
		super(); // Object클래스의 기본생성자 호출 생략가능
		this.x = x;
		this.y = y;
	}

	// 메소드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
}
