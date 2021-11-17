package abstraction;
	abstract class Bankk{
		abstract int rate();
	}
	class Sbi extends Bankk{
		int rate() {
			return 8;
		}
	}
	class Pnb extends Bankk{
		int rate() {
			return 7;
		}
	}
public class Bank {
	public static void main(String args[]) {
		Bankk b;
		b=new Sbi();
		System.out.println("SBI rate of interest:"+b.rate()+" %");
		b=new Pnb();
		System.out.println("PNB rate of interest:"+b.rate()+" %");
		
	}

}
