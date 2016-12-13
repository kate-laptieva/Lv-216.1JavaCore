package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {

		System.out.println("Hello");
		System.out.println("Set standart tariff for all countries");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the first country tariff");
		int tariff1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the second country tariff");
		int tariff2 = Integer.parseInt(br.readLine());
		System.out.println("Enter the third country tariff");
		int tariff3 = Integer.parseInt(br.readLine());

		System.out.println("Enter the number of minutes for the first country");
		int mitute1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the number of minutes for the first country");
		int mitute2 = Integer.parseInt(br.readLine());
		System.out.println("Enter the number of minutes for the first country");
		int mitute3 = Integer.parseInt(br.readLine());

		int prise1 = tariff1 * mitute1;
		int prise2 = tariff2 * mitute2;
		int prise3 = tariff3 * mitute3;
		int totalSum = prise1+prise2+prise3;
		
		System.out.println("The first prise for the country 1 is  : " + prise1 +" UAH .");
		System.out.println("The second prise for the country 2 is : " + prise2 +" UAH .");
		System.out.println("The third prise for the country 3 is  : " + prise3 +" UAH .");
		System.out.println("=================");
		System.out.println("Total prise is : " +totalSum+" UAH .");
	}
}
