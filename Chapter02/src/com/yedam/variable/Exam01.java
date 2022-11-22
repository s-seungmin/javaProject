package com.yedam.variable;

public class Exam01 {
	static int v4;
	public static void main(String[] args) {
		int value=0;
		System.out.println(value);
		value=10;
		System.out.println(value);
		
		//변수 값 복사
		int x=3;
		int y=5;
		int temp;
		
		//데이터 변경전
		System.out.println("x : "+x+", "+"y : "+y);

		temp=x;
		x=y;
		y=temp;
		
		//데이터 변경후
		System.out.println("x : "+x+", "+"y : "+y);
		
		int v1=15;
		
		if(v1>10) {
			int v2;
			v2=v1-10;
		}
		int v2 = 0;
		int v3=v1+v2+5;
		
		}

}