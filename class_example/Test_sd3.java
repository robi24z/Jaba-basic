package class_example;
	class Studentt{
		int rollno;
		String  name;
		void insert(int r, String n) {
			rollno=r;
			name=n;
		}
		void display() {
			System.out.println(rollno+" "+name);
		}
	}
public class Test_sd3 {
	public static void main(String args[]) {
		Studentt s1=new Studentt();
		Studentt s2=new Studentt();
		s1.insert(101,"Robin");
		s2.insert(102,"Ashly");
		s1.display();
		s2.display();
		
	}

}
