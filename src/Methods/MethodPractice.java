package Methods;

public class MethodPractice {

	public static void main(String[] args) {
		// to call static method from same class
		demo();
		//to call non-static method create object
		MethodPractice m=new MethodPractice();
		m.demo1();
		practicestatic.demo3();//static method from different class
	    practiceNonstatic pn=new practiceNonstatic();
	    pn.demo4();
	}
	public static void demo()//static method with same class
	
	{
		int a=20;
		int b=30;
		int add=a+b;
		System.out.println("Addition is "+add);
	}
    public void demo1()//Non static method with different class
    
    {
    	int a=20;
		int b=30;
		int sub=a-b;
		System.out.println("Addition is "+sub);
		
		
}
}