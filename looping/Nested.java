package looping;

public class Nested {
	public static void main(String args[]) {
		int a=100,b=50,c=20;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		else
		{
			System.out.println("B is greater");
		}
		}
	}


