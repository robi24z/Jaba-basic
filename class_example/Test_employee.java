package class_example;
	class Employee{
		int id;
		String name;
		float salary;
		void insert(int i,String n,float s) {
			id=i;
			name=n;
			salary=s;
		}
		void display() {
			System.out.println(id+" "+name+" "+salary);
		}
	}

public class Test_employee {
	public static void main(String args[]) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.insert(101,"Robin",45000);
		e2.insert(102,"Ashly",45000);
		e1.display();
		e2.display();
	}

}
