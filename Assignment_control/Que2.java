package Assignment_control;

import java.util.Scanner;

public class Que2 {
	public static void main(String args[]) {
		int a,b;
		System.out.print("Enter two numbers:");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		if(a>b) {
			System.out.println(a+" is greater");
		}
		else{
			System.out.println(b+" is greater");
			
		}
		
	}

}
