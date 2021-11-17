package abstraction;
	abstract class Bikee{
		Bikee(){
			System.out.println("Bike is created");
		}
		abstract void run();
		void gear() {
			System.out.println("Gear changed");
		}
	}
	class Hero extends Bikee{
		void run() {
			System.out.println("Running safetly");
		}
	}
public class Test3 {
	public static void main(String args[]) {
		Bikee j=new Hero();
		j.run();
		j.gear();
	}

}
