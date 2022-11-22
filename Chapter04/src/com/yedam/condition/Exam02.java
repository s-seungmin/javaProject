package com.yedam.condition;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		//학점 계산하기
		//switch문으로 해결
		//입력받은 점수를 토대로 학점을 출력
		//90 이상 A
		//89~80 B
		//79~70 C
		//69~60 D
		//그 외는 F
		Scanner sc=new Scanner(System.in);
		System.out.println("성적 입력>");
		int score=Integer.parseInt(sc.nextLine());
		
		switch(score/10) {
		case 9:
		case 10:
			System.out.println('A');
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
