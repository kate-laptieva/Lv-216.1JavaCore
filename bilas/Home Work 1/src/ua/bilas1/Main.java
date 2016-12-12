package ua.bilas1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is your name?");
		
		String name = bufferedReader.readLine();
		
		System.out.println("what is your age?");
		
		String a = bufferedReader.readLine();
		
		int age = Integer.parseInt(a);
		
		System.out.println("what is your address, " + name + "?");
		
		String address = bufferedReader.readLine();
		
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("address: " + address);
		
	}
}
