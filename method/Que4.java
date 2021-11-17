package method;

public class Que4 {
	void sum(int a,int b) {
		System.out.println("int method invoked");
	}
	void sum(long a,long b) {
		System.out.println("long method invoked");
	}
	public static void main(String args[]) {
		Que4 a=new Que4();
		a.sum(10,10);
	}

}
