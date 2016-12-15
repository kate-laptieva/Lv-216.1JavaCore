package homeworks.day3;

public class Person {

    private String name;
    private int birthYear;

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

    public Person(String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
    }

    public Person() {
    }

    public int age() {
	return 2016 - birthYear;
    }

    public void input(String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
    }
    
    public String output(){
	return name;
    }
    
    @Override
    public String toString() {
	return "Person [Name = " + name + ", birthYear = " + birthYear + "]";
    }

    public void changeName(String name) {
	this.name = name;
    }

}
