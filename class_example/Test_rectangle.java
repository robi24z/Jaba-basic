package class_example;
	class Rectangle{
		int length;
		int width;
		void insert(int l,int w) {
			length=l;
			width=w;
		}
		void d1() {
			System.out.println(length*width);
		}
	}
public class Test_rectangle {
	public static void main(String args[]) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		r1.insert(11,5);
		r2.insert(3,15);
		r1.d1();
		r2.d1();
	}

}
