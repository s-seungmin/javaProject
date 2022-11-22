package com.yedam.homework;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("세자리 숫자(양수)입력>");
		int inputValue=Integer.parseInt(sc.nextLine());

		int first=inputValue/100;
//		System.out.println(first);
		int second=(inputValue-(first*100))/10;
//		System.out.println(second);
		int third=((inputValue-(first*100)-(second*10)))/1;
//		System.out.println(third);
		System.out.println(inputValue+" 일 경우  "+first+" + "+second+" + "+third+" = "+
		(first+second+third)+" 으로 결과는 "+(first+second+third)+"입니다.");
		
	}
}
