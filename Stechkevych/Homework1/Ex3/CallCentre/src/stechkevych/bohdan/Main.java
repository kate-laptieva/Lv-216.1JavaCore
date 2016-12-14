package stechkevych.bohdan;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		float c1, c2, c3;
		float t1, t2, t3;
		float p1, p2, p3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price per minute for first country:");
		c1 = sc.nextFloat();
		System.out.println("Enter the price per minute for second country:");
		c2 = sc.nextFloat();
		System.out.println("Enter the price per minute for third country:");
		c3 = sc.nextFloat();
		System.out.println("Enter the time talks for fist country");
		t1 = sc.nextFloat();
		System.out.println("Enter the time talks for second country");
		t2 = sc.nextFloat();
		System.out.println("Enter the time talks for third country");
		t3 = sc.nextFloat();
		p1=c1*t1;
		p2=c2*t2;
		p3=c3*t3;
		System.out.println("Price per call for first country: "+p1);
		System.out.println("Price per call for second country: "+p2);
		System.out.println("Price per call for third country: "+p3);
		System.out.println("Sum three call is: "+(p1+p2+p3));
	}
}
