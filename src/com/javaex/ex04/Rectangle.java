package com.javaex.ex04;

public class Rectangle { // 기본값 누구를 상속받는지?

	// 필드
	private int width;
	private int height;

	// 생성자
	public Rectangle() {
		super(); //
	}

	public Rectangle(int width, int height) {
		super(); //
		this.width = width;
		this.height = height;
	}

	//메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드 일반
	
	

}
