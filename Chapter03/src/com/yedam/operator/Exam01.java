package com.yedam.operator;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

public class Exam01 {
	public static void main(String[] args) {
		//부호 연산자 +,-
		int x=-100;
		int result1= -x;
		int result2= +x;
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		
		byte b=100;
//		byte result3=-b;
		int result3=-b;
		
		//증감 연산자 ++,--
		//위치에 따라서 연산 타이밍 다름
		int value=100;
		//출력문이 실행되고 나서 value값 1증가
		System.out.println(value++);
		//출력문이 실행되기 전 value값 1증가
		System.out.println(++value);
		
		//논리 부정 연산자(not)
		//true + not(!) = false
		//false + not(!) = true
		boolean flag=true;
		if(!flag) {
			System.out.println("false");
		}
		if(flag) {
			System.out.println("true");
		}
		
		//이항 연산자(사칙연산)
		int v1=10;
		int v2=3;
		
		System.out.println(v1+v2);
		System.out.println(v1-v2);
		System.out.println(v1*v2);
		
		//나누기가 2개가 존재
		System.out.println("/ : "+(v1/v2));
		System.out.println("% : "+(v1%v2));
		
		//문자열 결합 연산자(+)
		System.out.println("자바"+"jdk"+"11버전");
		
		//비교 연산자
		int num1=10;
		int num2=10;
		
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>=num2);
		
		char char1='A'; //65
		char char2='B'; //66
		
		System.out.println(char1<char2);
		//문자열 비교는 == 아니고 문자열.equals(비교대상)
		
		//논리 연산자 =>&&<->& ||<->|
		//&& =>단 하나의 조건이(첫번째 조건에서 f시 계산종료) f=>f
		//& 전체조건 계산후 결과값 반환(속도차이)
		
		int charCode='A';
		//'A'~'Z'
		if(charCode>=65 && charCode<=90) {
			System.out.println("대문자.");
		}
		//58~57
		// caharCode>=48 && charCode<=57
		// !< => >=		!> => <=
		if(!(charCode<48) && !(charCode>57)){
			System.out.println("0~9 숫자.");
		}
		
		int value2=6;
		//2의 배수(2,4,6,8..) 3의 배수(3,6,9..)
		if(value2%2==0 || value2%3==0) {
			System.out.println("2 또는 3의 배수");
		}
		
		//대입 연산자 =, +=, -=...
		int result5=0;
		result5+=1; //result5=result5+1
		
		//삼항 연산자
		
		int score=85;
		
		char grade= (score>90) ? 'A' : 'B';
		
		char grade2;
		
		if(score>90) {
			grade2='A';
		}else {
			grade2='B';
		}
		
	}
}
