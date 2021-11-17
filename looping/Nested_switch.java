package looping;

public class Nested_switch {
	public static void main(String args[]) {
		char branch='c';
		int year=2;
		switch(year)
		{
		case 1:
			System.out.println("Eng,math,phy");
			break;
		case 2:
			switch(branch)
			{
			case 'c':
				System.out.println("os,java,ds");
				break;
			case  'e':
				System.out.println("Micro,Logic");
				break;
			case 'm':
				System.out.println("Drawing,Machines");
				break;
				
			}
			break;
		case 3:
			switch(branch)
			{
			case 'c':
				System.out.println("Micro,java");
				break;
			case  'e':
				System.out.println("ds,Machines");
				break;
			case 'm':
				System.out.println("Drawing,logic");
				break;
			}
			break;
		case 4:
			switch(branch)
			{
			case 'c':
				System.out.println("ds,oogic");
				break;
			case  'e':
				System.out.println("micro,drawing");
				break;
			case 'm':
				System.out.println("Drawing,logic");
				break;
			}
			break;
			
		}
	}

}
