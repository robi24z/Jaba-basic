package inheritance_exp;

	class Babydog extends Dog{
		void cry() {
			System.out.println("Weeping......");
		}
	}
public class Multilevel {
	public static void main(String args[]) {
		Babydog d=new Babydog();
		d.bark();
		d.eat();
		d.cry();
		
	}

}
