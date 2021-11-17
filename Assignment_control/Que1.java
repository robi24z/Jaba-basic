package Assignment_control;

import java.util.Scanner;

public class Que1 {
	public static void main(String args[]) {
		int a;
		System.out.println("Enter a number:");
		Scanner scan= new Scanner(System.in);
		a=scan.nextInt();
		if(a>0) {
			System.out.println("Number is Positive");
		}
		else{
			System.out.println("Number is Negative");
		}
	}

}
