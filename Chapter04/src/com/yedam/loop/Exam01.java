package com.yedam.loop;

public class Exam01 {
	public static void main(String[] args) {
		int sum=0;
		//규칙
		sum = sum+1;
		sum = sum+2;
		sum = sum+3;
		sum = sum+4;
		sum = sum+5;
		
		//1~5까지의 합을 구하는 반복문
		for(int i=0;i<=5;i++) {
			sum=sum+i;
		}
		
		//짝수 구하는 반복문
		for(int i=1;i<100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//1~100 홀수 구하는 반복문
		for(int i=1;i<100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		//1~100 2의 배수 또는 3의 배수 찾기=>6의 배수
		for(int i=1;i<100;i++) {
			if(i%2==0 &&i%3==0) {
				System.out.println(i+"는 2의배수 또는 3의 배수입니다.");
			}
		}
		
		//구구단 출력
		//2단출력
		//2*1,2*2,2*3...2*9
		for(int i=2;i<10;i++) {
			System.out.println("2 x "+i+" = "+(2*i));
		}
		System.out.println("");
		//for문 안에 for문
		//초기화식에 들어가는 변수를 두개를 고려
		//구구단 출력(2~9단)
		for(int i=2;i<10;i++) {
			//i=2 일때
			//아래 반복문은 9번 돌아감.
			for(int j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println("");
		}
		
		//공포의 별 찍기
		//*****
		//*****
		//*****
		//*****
		//*****
		for(int i=1;i<=5;i++) {
			String star="";
			for(int j=1;j<=5;j++) {
				//+연산자를 활용하여 *****를 만듬
				star=star+"*";
			}
			System.out.println(star);
		}
		System.out.println();
		
		//*
		//**
		//***
		//****
		//*****
		for(int i=1;i<=5;i++) {
			String star="";
			for(int j=0;j<i;j++) {
				star=star+"*";
			}
			System.out.println(star);
		}
		System.out.println();
		//*****
		//****
		//***
		//**
		//*
		for(int i=5;i>=1;i--) {
			String star="";
			for(int j=1;j<=i;j++) {
				star=star+"*";
			}
			System.out.println(star);
		}
		System.out.println("");
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		for(int i=5;i>0;i--) {
			String star="";
			for(int j=1;j<6;j++) {
				if(j>=i) {
					star=star+"*";
				}else {
					star=star+" ";
				}
			}
			System.out.println(star);
		}
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			String star="";
			for(int j=0;j<i;j++) {
				star=star+"*";
			}
			System.out.println(star);
		}
		System.out.println();
		
		
		
		
		
		
		
		
	}
}
