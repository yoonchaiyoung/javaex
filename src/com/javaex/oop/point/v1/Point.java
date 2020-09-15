package com.javaex.oop.point.v1;

// v1. 정보은닉 + Getter / Setter
public class Point {
	// 필드
	private int x;
	private int y;
	
	// Getter / Setter
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
	
	// 메소드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
}
