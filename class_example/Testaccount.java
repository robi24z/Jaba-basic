package class_example;
	class Account{
		int acno;
		String name;
		float amount;
		void insert(int a,String n,float amt) {
			acno=a;
			name=n;
			amount=amt;
		}
		void deposit(float amt) {
			amount=amount+amt;
			System.out.println(amt+" Deposited");
		}
		void withdraw(float amt) {
			if(amount<amt) {
				System.out.println("Insufficient balane");
			}
			else {
				amount=amount-amt;
				System.out.println(amt+" Withdrawn");
			}
		}
		void balance() {
			System.out.println("Balance is "+amount);
		}
		void d2(){
			System.out.println(acno+" "+name+" "+amount);
		}
	}
	//main
public class Testaccount {
	public static void main(String args[]) {
		Account a1=new Account();
		a1.insert(12345,"Robin",25000);
		a1.d2();
		a1.balance();
		a1.deposit(20000);
		a1.balance();
		a1.withdraw(5000);
		a1.balance();
		
	}

}
