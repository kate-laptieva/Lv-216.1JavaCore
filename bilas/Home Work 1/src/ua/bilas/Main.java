package ua.bilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("add circle radius:");
		String str = bufferedReader.readLine();
		int r = Integer.parseInt(str);
		
//		double pi = Math.PI;
		
//		double s = pi * r * r;
		
//		double p = 2 * pi * r;
		
//		double s = Math.PI * Math.pow(r, 2);
//		
//		double p = 2 * Math.PI * r;
//		
//		System.out.println("perimetr: " + p);
//		System.out.println("square: " + s);
		
		System.out.println("perimetr of circle R = " + r + " is " + (Math.PI * Math.pow(r, 2)));
		System.out.println("square of circle R = " + r + " is " + (2 * Math.PI * r));
	}
}
