package looping;

public class break_while {
	public static void main(String args[]) {
		int i=1;
		while(i<=10) {
			if(i==7) {
				i++;
				break;
			}
			System.out.println(i);
			i++;
		}
		
	}

}
