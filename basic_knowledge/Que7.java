package basic_knowledge;

import java.util.Scanner;

public class Que7 {
	public static void main(String args[]) {
		int a,i;
		System.out.print("Enter a number:");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		
		for(i=1;i<=10;i++)
		{
			System.out.println(a+"x"+i+"="+(a*i));
		}
	}

}
