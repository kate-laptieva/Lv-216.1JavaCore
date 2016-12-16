import java.util.Calendar;
import java.util.Scanner;


public class Person {
	
	private String name;
	private int birthYear;
	
	public Person() {
		input();
	}
	public Person(String name, int birthYear) {
		
		this.name = name;
		this.birthYear = birthYear;
	}
		
	public int age(){
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year - birthYear;
		if(age<0){
			System.out.println("Input valid birthYear of " + name +" !!! ");
		}else 
			return age;
		return 0;
		
		
	}
	public void input(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Input name");
		String name = scn.nextLine();
		this.name = name;
		System.out.println("Input birthYear");
		int birthYear = Integer.parseInt(scn.nextLine());
		this.birthYear = birthYear;
		
	}
	public void output(Person person){
		System.out.println(person);
		
	}
	public void changeName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String dead(){
		if(age()>100){
			return "dead";
		}
		return null;
	}
	@Override
	public String toString() {
		if(dead()==null){
			return "Person [name = " + name + ", birthYear = " + birthYear + ", age = " + age() + "]";
		}
		return "Person [name=" + name + ", birthYear=" + birthYear + ", age = " + age() + ", " + dead() + "]";
	}

}
