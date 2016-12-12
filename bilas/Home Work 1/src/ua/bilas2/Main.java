package ua.bilas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("add call price for first country:");
		int c1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("add call price for second country:");
		int c2 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("add call price for third country:");
		int c3 = Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("first: " + c1 + " second: " + c2  + " third: " + c3);
		
		
		System.out.println("add call time for first country:");
		int t1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("add call time for second country:");
		int t2 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("add call time for third country:");
		int t3 = Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("first: " + t1 + " second: " + t2  + " third: " + t3);
		
		int price1 = c1 * t1;
		int price2 = c2 * t2;
		int price3 = c3 * t3;
		
		System.out.println("price 1: " + price1);
		System.out.println("price 2: " + price2);
		System.out.println("price 3: " + price3);
		
		System.out.print("total price:");
		System.out.println(price1 + price2 + price3);
	}
}
