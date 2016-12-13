package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {

	private double radius;

	public FlowerBed() throws IOException {
		System.out.println("Please, set the radius! ");
		System.out.print("R = ");
		read();
		getPerimetr();
		getArea();
	}

	public void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			radius = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Err :Incorrect entries expected int");
			tryAgain();
		}

	}

	public void getPerimetr() throws IOException {
		if (getRadius() != 0) {
			double result = (double) Math.round(getRadius() * Math.PI * 2);
			System.out.println("Perimetr : P = " + result);
		}

	}

	public void getArea() throws IOException {

		if (getRadius() != 0) {
			double result = (double) Math.round(Math.PI * Math.pow(radius, 2));

			System.out.println("Area : S = " + result);
		}
	}

	public void tryAgain() throws IOException {
		System.out.println("Try again ");
		System.out.print("R = ");
		read();
	}

	public double getRadius() {
		return radius;
	}

}
