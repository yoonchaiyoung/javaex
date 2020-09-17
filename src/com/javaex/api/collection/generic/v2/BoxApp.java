package com.javaex.api.collection.generic.v2;

// v2.
public class BoxApp {

	public static void main(String[] args) {
		// Box 만들고, 데이터 세팅
		Box<Integer> intBox = new Box<>();	// Box<Integer> intBox = new Box<Integer>(); 이렇게 뒷부분에는 생략해도 됨
		intBox.setContent(2020);
//		intBox.setContent("Java");			// 컴파일러가 체크
		
		// 값을 꺼내보자.
		int retVal = intBox.getContent();		// 캐스팅 불필요
		System.out.println("내용물:" + retVal);
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		
		// Generic을 이용하면 안전하고 캐스팅 필요 없어서 편리
		String content = strBox.getContent();
		System.out.println("strBox의 내용물:" + content);
		
	}

}
