package looping;

public class Pyramid_down {
	public static void main(String args[]) {
		int i,j,t=3;
		for(i=1;i<=t;i++) {
			for(j=t;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
