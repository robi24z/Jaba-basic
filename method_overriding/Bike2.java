package method_overriding;

class Que1 {
	void run() {
		System.out.println("Vehicle is running");
	}

}

class Bike2 extends Que1 {
	void run() {
		System.out.println("Bike is running safetly");
	}

	public static void main(String args[]) {
		Bike2 b = new Bike2();
		b.run();
	}
}
