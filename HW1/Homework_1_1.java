package homeworks;

import java.util.Scanner;

public class Homework_1_1 {


	private static Scanner sc;

	public static void main(String[] args) {

	sc = new Scanner(System.in);

		System.out.println("Please, write a radius");
		int radius = sc.nextInt();
		double perimeter = 2 * radius * Math.PI;
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
	}
}
