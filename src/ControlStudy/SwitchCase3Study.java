package ControlStudy;

public class SwitchCase3Study {

	public static void main(String[] args) {
        /* today is Mon --> this is 1st day of week
		   today is Tue --> this is 2nd day of week
		   today is Wend --> this is 3rd day of week
		   today is Thr --> this is 4th day of week
		   today is Fri --> this is 5th day of week
		   today is Sat --> this is 6th day of week
           today is Sunday --> this is 7th day of week*/
		
		   String Day="Sat";
		 //String Day="Moon Day";
		switch (Day) 
		{
		case "Mon":System.out.println("this is 1st day of week");
		break; 
		case "Tue":System.out.println("this is 2nd day of week");
		break;
		case "Wend":System.out.println("this is 3rd day of week");
		break;
		case "Thr":System.out.println("this is 4th day of week");
		break;
		case "Fri":System.out.println("this is 5th day of week");
		break;
		case "Sat":System.out.println("this is 6th day of week");
		break;
		case "Sun":System.out.println("this is 7th day of week");
		break;
        default:System.out.println("Please Enter Valid Day");
			break;
		}
	}
	

}
