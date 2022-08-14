package ControlStudy;

public class SwichCase2Study {

	public static void main(String[] args) {
		        //Grade A--> if i got >=90 
				//Grade B -->i got >=66 and <90 
				//Grade C i got >=50 and <66 
				//Grade D i got >=40 and <50 
				// i am fail
		
		char Grade='C';
		//char Grade='E';
		
				
    switch (Grade) {
  
	case 'A':System.out.println("i got >=90 ");
	break;
	case 'B':System.out.println("i got >=66 and <90");
	break;
	case 'C':System.out.println("i got >=50 and <66");
	break;
	case 'D':System.out.println("i got >=40 and <50");
	break;
	
	

	default:System.out.println("I am Fail");
		break;
	}
	}

}
