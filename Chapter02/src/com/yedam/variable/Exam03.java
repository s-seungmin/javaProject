package com.yedam.variable;

public class Exam03 {
	public static void main(String[] args) {
		char cVar='A'+1;
		int iVar=cVar;
		System.out.println(iVar);
		double dVar=iVar;
		System.out.println(dVar);
		
		//강제 타입 변환
		iVar=(int)dVar;
		System.out.println(iVar);
		cVar=(char)iVar;
		System.out.println(cVar);
		System.out.println();
		double dVar2=3.14444;
		int iVar2=(int)dVar2;
		System.out.println(iVar2);
		
		byte result=10+20;
		System.out.println(result);
		
		byte x=10;
		byte y=20;
		int result2=x+y;
		byte result3=(byte)(x+y);
		
		//데이터 타입 크기에 따른 연산
		//long + int = long
		//byte + int = int
		byte bVar=10;
		int iVar1=100;
		long lVar=1000L;
		int result4=(int)(bVar+iVar1+lVar);
		System.out.println(result3);
		
		
		
	}
}
