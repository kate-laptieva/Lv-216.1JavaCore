package homeworks;

import java.util.Scanner;

public class Homework_1_3 {

    private static Scanner sc;

    public static void main(String[] args) {

	sc = new Scanner(System.in);
	System.out.println("Please, enter c1, c2, c3 in UAH");
	double c1 = sc.nextDouble();
	double c2 = sc.nextDouble();
	double c3 = sc.nextDouble();
	System.out.println("Please, enter t1, t2, t3 in minutes");
	double t1 = sc.nextDouble();
	double t2 = sc.nextDouble();
	double t3 = sc.nextDouble();
	System.out.println("You should pay for first call = "+c1*t1+" UAH, "+"for second call = "+c2*t2+" UAH, "+"for third call = "+c3*t3+" UAH." );
	System.out.println("In summary = "+(c1*t1+c2*t2+c3*t3)+" UAH");
    }
}
