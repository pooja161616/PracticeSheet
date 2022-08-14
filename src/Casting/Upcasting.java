package Casting;

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.creditcard();
		b.debitcard();
		System.out.println("================================");
		BajajFinanace bf=new BajajFinanace();
		bf.bajajFine();
		bf.creditcard();
		bf.debitcard();
		System.out.println("================================");
		
		Bank b1=new BajajFinanace();
		b1.creditcard();
		b1.debitcard();
		//b1.bajajfine();This method is not common method
	}

}
