import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println("What is your name ?");
		String name = scn.nextLine();
		System.out.println("How old are you ?");
		int age = Integer.parseInt(scn.nextLine());
		
		System.out.println("Your name is " + name + " and you are " + age + " years old");
	}

}
