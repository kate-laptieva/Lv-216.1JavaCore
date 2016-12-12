import java.util.Scanner;

public class Calls {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Input value for the  first country ");
		double country1 = Double.parseDouble(scn.nextLine());
		System.out.println("Input quantity of minutes ");
		int minutes1 = Integer.parseInt(scn.nextLine());
		double price1 = country1 * minutes1;
		
		
		System.out.println("Input value for the second country ");
		double country2 = Double.parseDouble(scn.nextLine());
		System.out.println("Input quantity of minutes ");
		int minutes2 = Integer.parseInt(scn.nextLine());
		double price2 = country2 * minutes2;
		
		
		System.out.println("Input value for the third country ");
		double country3 = Double.parseDouble(scn.nextLine());
		System.out.println("Input quantity of minutes ");
		int minutes3 = Integer.parseInt(scn.nextLine());
		double price3 = country3 * minutes3;
		
		double totalPrice = price1+price2+price3;
		
		System.out.println("The price for call to country 1 " + price1+"$");
		System.out.println("The price for call to country 2 " + price2+"$");
		System.out.println("The price for call to country 3 " + price3+"$");
		System.out.println("The total price " + totalPrice+"$");

	}

}
