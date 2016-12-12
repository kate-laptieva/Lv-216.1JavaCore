package stechkevych.bohdan;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double p = 2*Math.PI*r;
		double s = Math.PI*Math.pow(r, 2);
		System.out.println("Perimeter ="+p);
		System.out.println("Area ="+s);

		
	}
}
