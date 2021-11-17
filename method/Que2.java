package method;
	
	class Addd{
		static int add(int a,int b) {
			return a+b;
		}
		static double add(double a,double b) {
			return a+b;
		}
	}
	
public class Que2 {
	public static void main(String args[]) {
		System.out.println(Addd.add(10, 10));
		System.out.println(Addd.add(20, 20));
	}

}
