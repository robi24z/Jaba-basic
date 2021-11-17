package inheritance_exp;
	class Employee{
		float salary=40000;
	}
public class Programmer extends Employee {
	float bonus=10000;
	public static void main(String args[]) {
		Programmer p=new Programmer();
		System.out.println("Programmer salary: "+p.salary);
		System.out.println("Bonus of programmer: "+p.bonus);
	}

}
