package Assignment_control;

import java.util.Scanner;

public class Que13 {
	public static void main(String args[]) {
		int a,b,c;
		System.out.println("Enter a two number: ");
		System.out.println("A=");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		System.out.println("B=");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Swapped numbers are: A="+a+" B="+b);
		
		
	}

}
