package com.javaex.oop.summary;

public class Human extends Animal {
	// 생성자
	public Human(String name) {
		super(name);
	}
	
	@Override
	public void say() {	// 반드시 오버라이드
		System.out.println("안녕, 나는 " + name + "이야");
		

	}

}
