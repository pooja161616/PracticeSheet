package ControlStudy;

public class ElseIfStudy {

	public static void main(String[] args) {
		 //if its summer then its very hot
		// if its rainy then its raining heavily 
		// if its winter then its very cold
		// invalid season
		
		  String Season="Winter";
		 // String Season="Cloudy";
		
		if(Season=="Summer")
		{
			System.out.println("its very hot");
		}
		else if(Season=="Rainy")
		{
			System.out.println("its raining heavily ");
		}
		else if(Season=="Winter")
		
		{
			System.out.println("its very cold");
		}
		else
		{
			System.out.println("Invalid Season");
		}
	}

}
