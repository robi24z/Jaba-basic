package looping;

public class Break_do_while {
	public static void main(String args[]) {
		int i=1;
		do
		{
			if(i==6)
			{
				i++;
				break;
			}
			System.out.println(i);
			i++;
		}while(i<=10);
		
	}

}
