package polymorphism;
class Animal1{
	void eat() {
		System.out.println("Eating......");
	}
}
class Dog1 extends Animal1{
	void eat() {
		System.out.println("Eating fruits......");
	}
}
class Babydog extends Animal1{
	void eat() {
		System.out.println("Drinking milk......");
	}
}
public class Que3 {
	public static void main(String args[]) {
		Animal1 a1,a2,a3;
		a1=new Animal1();
		a1.eat();
		a2=new Dog1();
		a2.eat();
		a3=new Babydog();
		a3.eat();
	}

}
