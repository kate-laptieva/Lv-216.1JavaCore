package homeworks;

import java.util.Scanner;

public class Homework_1_2 {

    private static Scanner sc;

    public static void main(String[] args) {
	sc = new Scanner(System.in);

	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("Where are you live, " + name + "?");
	String adress = sc.nextLine();
	System.out.println("How old are you?");
	int age = sc.nextInt();

	System.out.println("Hi, " + name + ", your age '" + age + ", you live in " + adress + ".");
    }

}
