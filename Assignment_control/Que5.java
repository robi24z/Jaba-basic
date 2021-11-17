package Assignment_control;

import java.util.Scanner;

public class Que5 {
	public static void main(String args[]) {
		String month="";
		System.out.println("Enter the month:");
		Scanner scan=new Scanner(System.in);
		month=scan.nextLine();
		switch(month)
		{
		case "january":
			System.out.println("1 st month");
			break;
		case "february":
			System.out.println("2 nd month");
			break;
		case "march":
			System.out.println("3 rd month");
			break;
		case "april":
			System.out.println("4 th month");
			break;
		case "may":
			System.out.println("5 th month");
			break;
		case "june":
			System.out.println("6 th month");
			break;
		case "july":
			System.out.println("7 th month");
			break;
		case "august":
			System.out.println("8 th month");
			break;
		case "september":
			System.out.println("9 th month");
			break;
		case "october":
			System.out.println("10 th month");
			break;
		case "november":
			System.out.println("11 th month");
			break;
		case "december":
			System.out.println("12 th month");
			break;
		default :
			System.out.println("Invalid month");
			break;
		}
		
		
	}

}
