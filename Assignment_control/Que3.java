package Assignment_control;

import java.util.Scanner;

public class Que3 {
	public static void main(String args[]) {
		int year;
		System.out.println("Enter the year:");
		Scanner scan= new Scanner(System.in);
		year=scan.nextInt();
		if((year%4==0)&&(year%100!=0))
		{
			System.out.println("leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
