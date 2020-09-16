package com.javaex.api.objectclass.v1;

// Object 클래스
// v1. toString 오버라이드
public class Point {
	// 필드
	protected int x;
	protected int y;	// 자식 클래스에 접근 권한 허용
	
	// 생성자
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
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
	
	public void draw(boolean bDraw) {
		// 메소드 오버로딩
		String message = String.format("점[x=%d, y=%d]을", x, y);
		
		message += bDraw ? "그렸습니다.": "지웠습니다.";
		
		System.out.println(message);
	}

	@Override
	public String toString() {
		// 문자열 형식 반환
		return String.format("Point(%d, %d)",  x, y);
	}
	
	
}
