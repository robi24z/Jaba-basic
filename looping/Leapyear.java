package looping;

public class Leapyear {
	public static void main(String args[]) {
		int a=2024;
		if(((a%4==0)&&(a%100!=0))||(a%400==0)) {
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Common year");
		}
	}

}
