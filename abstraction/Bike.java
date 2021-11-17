package abstraction;
	abstract class Bike{
		abstract void run();
	}
	class Honda extends Bike{
		void run() {
			System.out.println("Running safetly");
		}
		public static void main(String args[]) {
			Bike B=new Honda();
			B.run();
		}
		
	}

