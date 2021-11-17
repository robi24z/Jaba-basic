package method;
	class Adder{
		static long add(int a,long b) {
			return a+b;
		}
		static int add(int a,int b,int c) {
			return a+b+c;
		}
	}
public class Que3 {
	public static void main(String args[]) {
		System.out.println(Adder.add(10, 10));
		System.out.println(Adder.add(20,20,20));
	}

}
