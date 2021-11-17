package polymorphism;
	
class Bank{
	float rate() {
		return 0;
	}
}
class Sbi extends Bank{
	float rate() {
		return 8.4f;
	}
}
class Icici extends Bank{
	float rate() {
		return 7.3f;
	}
}
class Axis extends Bank{
	float rate() {
		return 9.7f;
	}
}
public class Que1 {
	public static void main(String args[]) {
		Bank b;
		b=new Sbi();
		System.out.println("SBI rate of interest:"+b.rate());
		b=new Icici();
		System.out.println("ICICI rate of interest:"+b.rate());
		b=new Axis();
		System.out.println("AXIS rate of interest:"+b.rate());
	}

}
