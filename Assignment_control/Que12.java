package Assignment_control;

import java.util.Scanner;

public class Que12 {
	public static void main(String args[]) {
		int i,j,a;
		System.out.println("multiplication table");
		System.out.println("Enter which table to display:");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		for(i=1;i<=12;i++) {
			for(j=a;j<=a;j++) {
				System.out.println(i+"*"+a+"="+i*a);
			}
		}
	}

}
