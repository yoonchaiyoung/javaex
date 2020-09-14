package com.javaex.basic;

// 기본 자료형 연습
public class TypesEx {

	public static void main(String[] args) {
//		booleanEx();
//		integerTypesEx();
//		floatDoubleEx();
//		charEx();
//		constantEx();
//		implicitCastingEx();
		explicitCastingEx();
	}
	
	public static void explicitCastingEx() {
		// 명시적 형변환
		// 표현 범위가 넓은 자료형 -> 표현 범위가 좁은 자료형으로의 변환
		// 데이터 유실이 발생 가능 -> 개발자가 강제로 변환
		float f = 12345678.901234F;
		System.out.println(f);
		
		int i = (int)f;
		System.out.println(i);
		short s = (short)i;
		System.out.println(s);
		byte b = (byte)s;
		System.out.println(b);
	}
	
	public static void implicitCastingEx() {
		// 암시적 형변환
		// 표현 범위가 좁은 자료형 -> 표현 범위가 넓은 자료형
		byte b = 25;	// 1바이트 정수
		System.out.println(b);
		short s = b;	// 2바이트 정수
		System.out.println(s);
		int i = s;		// 4바이트 정수
		System.out.println(i);
		long l = i;		// 8바이트 정수
		float f = l;	// float가 표현 범위가 넒음
		System.out.println(f);
		
		// byte < short < int < long < float < double
	}
	
	public static void constantEx() {
		// 상수 연습
		// 선언과 동시에 초기화 필요
		// 한번 초기화되면 변경 불가
		final double PI = 3.14159; 			//상수 식별자는 모두 대문자
		final int SPEED_LIMIT = 120;		// 단어의 조합은 _로 연결
		
		System.out.println("제한 속도는 " + SPEED_LIMIT + "입니다.");
		// 1. 코드 식별력이 높아지게 된다.
		// 2. 유지보수의 용이성 확보.
		
		// Java는 내부적으로 상수를 많이 활용
		System.out.println("파이:" + Math.PI);
	}
	
	public static void charEx() {
		// 2바이트 유니코드 (부호 없음)
		char ch1 = 'A'; // ''
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2);
		// int 형으로 변환 후 합산
		// char 형은 내부적으로는 수치화된 코드
	}
	
	public static void floatDoubleEx() {
		// 실수
		// float(4) < double(8)
		// 실수 표현 범위를 넓히고 정밀도를 포기한 것
		float fVar = 3.14159F;								// 뒤에 F
		double dVar = 3.14159;
		
		// 지수 표기법
		fVar = 3E-6F;	// 3 * 10^(-6) 
		dVar = 3E6;		// 3 * 10^6
		
		System.out.println(fVar);
		System.out.println(dVar);
		
		// 정밀도 체크
		System.out.println(0.1 * 3);
	}
	
	public static void integerTypesEx() {
		// byte(1) < short(2) < int(4) < long(8)
		int intVal;					// 선언
		intVal = 2020;				// 할당(초기화)
//		int intVal2 = 1234567890123;						// 범위 초과
		
		long longVal1;				// 8byte
		long longVal2;
		
		longVal1 = 2020;
		longVal2 = 1234567890123L;							// 뒤에 L
		
		// 표기법 : 
		int bin, oct, hex;
		bin = 0b1100;				// 2진수 0b
		oct = 072;					// 8진수 0
		hex = 0xFF;					// 16진수 0x
		
		System.out.println("2진수 0b1100 = " + bin);
		System.out.println("8진수 072 = " + oct);
		System.out.println("16진수 0xFF = " + hex);
	}
	
	public static void booleanEx() {
		// 논리형 : 1byte - true or false
		boolean b1 = true;	// 참
		boolean b2 = false;	// 거짓
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean result;
		
		int val1 = 3;
		int val2 = 5;
		
		// 비교연산 or 논리연산을 수행하면 결과로 boolean
		
		result = val1 < val2;	// 3 < 5 ?
		System.out.println("val1 < val2 ? " + result);
	}
} 