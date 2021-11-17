package method;

public class Que5 {
	void sum(int a,long b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String args[]) {
		Que5 m=new Que5();
		m.sum(15,15);
		m.sum(10,15,20);
	}
}
