package method_overriding;

class Bank {
	int rateOfInterest() {
		return 0;

	}
}

class Sbi extends Bank {
	int rateOfInterest() {
		return 8;
	}
}

class Icici extends Bank {
	int rateOfInterest() {
		return 7;
	}
}

class Axis extends Bank {
	int rateOfInterest() {
		return 9;
	}
}

class Que2 {
	public static void main(String args[]) {
		Sbi s=new Sbi();
		Icici i=new Icici();
		Axis a=new Axis();
		System.out.println("SBI rate of interest:"+s.rateOfInterest());
		System.out.println("ICICI rate of interest:"+i.rateOfInterest());
		System.out.println("Axis rate of interest:"+a.rateOfInterest());
	}

}
