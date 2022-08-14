package ControlStudy;

public class SwitchCase {

	public static void main(String[] args) {
		
		     //if its summer then its very hot
			// if its rainy then its raining heavily 
			// if its winter then its very cold
			// invalid season
		
		String Season="Rainy";
	
		switch (Season) 
		{
		case "Summer":System.out.println("its very hot");
			  break;
		case "Rainy":System.out.println("its Raining heavily");
		  break;
		case "Winter":System.out.println("its very cold");
		  break;
		default:System.out.println("Invalid Season");
			break;
		}
		
	}

}
