import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1 {
	
public static void main1(String[] args){
		int radius = 5;
		double area = Math.PI *(radius * radius);
		System.out.println("Flower bed's area is " +area);
		double perimeter = 2 * (Math.PI * radius);
		System.out.println("Flower bed's perimeter is "+perimeter);
	}
	
public static void main2(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String name;
	String address;
	int age = Integer.parseInt(br.readLine());
	
	System.out.println("What is your name?");
	name = br.readLine();
	System.out.println("Where are you live, " +name+ "?");
	address = br.readLine();
	System.out.println(name+age+address);
	}

public static void main3(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int c1 = Integer.parseInt(br.readLine());
	int c2 = Integer.parseInt(br.readLine());
	int c3 = Integer.parseInt(br.readLine());
	
	int t1 = Integer.parseInt(br.readLine());
	int t2 = Integer.parseInt(br.readLine());
	int t3 = Integer.parseInt(br.readLine());
	
	int a1 = c1*t1;
	int a2 = c2*t2;
	int a3 = c3*t3;
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a1+a2+a3);
		
	}
}