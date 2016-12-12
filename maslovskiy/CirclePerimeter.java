import java.util.Scanner;

public class CirclePerimeter {

	public static void main(String[] args) {
		
		Scanner scn=  new Scanner(System.in);
		
		System.out.println("Input radius");
		int R = Integer.parseInt(scn.nextLine());
		double CirclePerimeter = 2*Math.PI*R;
		double Area = Math.PI*R*R;
		System.out.println("The perimeter of the circle is = " + CirclePerimeter);
		System.out.println("The area of the circle is "+ Area);

	}

}
