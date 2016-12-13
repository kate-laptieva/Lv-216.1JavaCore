package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questions {

	public Questions() throws IOException {
		questionGen();
	}

	private String name;
	private int age;
	private String address;

	public void readName() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			name = br.readLine();
		} catch (IOException e) {
			System.out.println("incorrect entries expected String");
		}
	}

	public void readAge() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			age = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("incorrect entries expected int");
		}
	}

	public void readAddress() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		address = br.readLine();
	}

	public void questionGen() throws IOException {

		System.out.println("What is your name ?");
		readName();
		System.out.println("How old are you , " + getName() + " ?");
		System.out.print("Set age : ");
		readAge();
		System.out.print("Wehre are you live , " + getName() + " ?");
		System.out.println(" Please , set your presisely lacation :");
		readAddress();
		System.out.println("Thank!");
	}

	public String getName() {
		return name;
	}

}
