package com.yedam.inout;

import java.io.IOException;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) throws Exception {
		int value=123;
		String name="상품";
		double price=1000.10;
		System.out.printf("상품의 가격 : %d\n", value);
		System.out.printf("%s의 가격 : %d\n",name, value);
		System.out.printf("%s의 가격 : %d원, %f\n",name,value,price);
	
		//1) 정수 사용
		value=11;
		System.out.printf("%d\n", value);
		System.out.printf("%6d\n", value);
		System.out.printf("%-6d\n", value);
		System.out.printf("%06d\n", value);
		
		//2) 실수 사용
		price=123.4567;
		System.out.printf("%f\n", price);
		System.out.printf("%10.2f\n", price);
		System.out.printf("%-10.2f\n", price);
		System.out.printf("%010.2f\n", price);
		
		//3) 문자열 사용
		System.out.printf("%s\n", "문자열사용");
		System.out.printf("%6s\n", "문자열사용");
		System.out.printf("%-6s\n", "문자열사용");
		
		System.out.print("아무것도 없는 print\n");
		
		//입력
		int keyCode;
		System.out.println("원하는 값 입력>\n");
		keyCode=System.in.read();
		System.out.println("keyCode : "+keyCode);
		
		keyCode=System.in.read();
		System.out.println("keyCode : "+keyCode);
		
		keyCode=System.in.read();
		System.out.println("keyCode : "+keyCode);
		
		//스캐너(Scanner)
		Scanner sc=new Scanner(System.in); //통째로 외우기,sc-변수명
		System.out.println("데이터 입력>");
		String word=sc.nextLine();	//nextLine 문자열 입력
		System.out.println(word);
		
		//문자열 비교(정수,실수,논리: '=='사용가능, 문자는 불가능(equals사용)
		if(word.equals("text")) {
			System.out.println("equal : 입력하신 문자열과 비교 문자열이 같음.");	
		}
		if(word=="text") {
			System.out.println("== : 입력하신 문자열과 비교 문자열이 같음.");	
		}
		
		
	
	}
}
