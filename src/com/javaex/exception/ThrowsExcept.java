package com.javaex.exception;

import java.io.IOException;

// 강제 예외 발생
// 호출 되는 메소드가 완벽하게 예외를 복구할 수 없다면
// 호출한 메소드에게 예외를 위임하는 것이 더 낫다

public class ThrowsExcept {
	public void executeException() throws IOException {
		System.out.println("강제 예외 발생!");
		throw new IOException("강제 예외");
	}
	
	public void executeRuntimeException() throws RuntimeException {
		System.out.println("런타임 오류");
		throw new RuntimeException("런타임 오류");
	}
	
	public int divide(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			throw new CustomArithmeticException("사용자 정의 예외",  num1,  num2);
		}
		return result;
	}		
}
