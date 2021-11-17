package inheritance_exp;
	class Cat extends Animal{
		void meow() {
			System.out.println("Meowing......");
		}
	}
public class Heirarchical {
	public static void main(String args[]) {
		Cat c=new Cat();
		c.meow();
		c.eat();
	}

}
