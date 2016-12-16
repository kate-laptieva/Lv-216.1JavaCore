
public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person("Andrew",1993);
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
	
		p2.changeName("Gennadiy");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	
	}

}
