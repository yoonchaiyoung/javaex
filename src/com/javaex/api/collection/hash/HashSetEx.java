package com.javaex.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	// 집합을 나타내는 자료형
	// 순서 중요하지 않고, 중복 허용하지 않음
	public static void main(String[] args) {
		// 기본 자료형 HashSet에 활용
//		primTypeSet();
		customTypeSet();
	}

	private static void customTypeSet() {
		HashSet<Student> cls = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("임꺽정", 20);
		Student s3 = new Student("임꺽정", 20);
		
		cls.add(s1);
		cls.add(s2);
		cls.add(s3);
		
		// Hash 계열 자료형에서 두 객체가 동등함을 확인하는 방법
		// 1. hashCode() 값 비교
		// 2. equals() 결과 확인
		System.out.println("클래스:" + cls);
		System.out.println("s2와 s3의 해시코드 값이 같은가? " + (s2.hashCode() == s3.hashCode()));
		System.out.println("s2와 s3의 값이 같은가? " + s2.equals(s3));
		
		// 학생 임꺽정이 포함되어 있는가?
		System.out.println("학생 임꺽정이 포함 ? " + cls.contains(s2));
	}
	
	private static void primTypeSet() {
		// 선언
		HashSet<String> hs = new HashSet<>();
		
		hs.add("홍길동");
		hs.add("임꺽정");
		hs.add("장길산");
		hs.add("전우치");
		hs.add("임꺽정");						// hashSet : 중복 불가. 에러 나지 않음.
		
		System.out.println("Set:" + hs);
		
		// 지정 객체를 포함하고 있는가?
		System.out.println("임꺽정을 포함 ? " + hs.contains("임꺽정"));
		
		// 삭제 : remove
		hs.remove("임꺽정");
		System.out.println("Set:" + hs);

		hs.remove("임꺽정");
		System.out.println("Set:" + hs);	// 이미 임꺽정 없기 때문에 변화 없음. 에러 나지 않음.
	}
}
