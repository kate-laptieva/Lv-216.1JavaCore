package homeworks.day3;

public class PersonInfo {

    public static void main(String[] args) {
	Person person1 = new Person("Oleg", 1976);
	Person person2 = new Person("Vitalii", 1997);
	Person person3 = new Person("Sofia", 1989);
	Person person4 = new Person();
	person4.setName("Stepan");
	person4.setBirthYear(2003);
	Person person5 = new Person();
	person5.setName("Oksana");
	person5.setBirthYear(1991);
	Person person6 = new Person();
	person6.input("Vika",1985);
	System.out.println(person1 + " Age = " + person1.age());
	System.out.println(person2 + " Age = " + person2.age());
	System.out.println(person3 + " Age = " + person3.age());
	System.out.println(person4 + " Age = " + person4.age());
	System.out.println(person5 + " Age = " + person5.age());
	System.out.println(person6 + " Age = " + person6.age());
	System.out.println("Person3 Old name = " + person6.output());
	person3.changeName("Maria");
	System.out.println("Person3 New name = " + person3.getName());
    }
}
