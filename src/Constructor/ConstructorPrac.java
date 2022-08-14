package Constructor;

public class ConstructorPrac {
	
	//variable declaration
	int a;
	int b;
	
	/*public ConstructorPrac()//constructor without parameter
	{
		System.out.println("This is user defined constructor without parameter");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorPrac cp=new ConstructorPrac();//created object 
		ConstructorPrac cp=new ConstructorPrac();
		cp.add();

	}
	
	public ConstructorPrac()//user defined constructor
	{
		a=10;//variable initialization
		b=0;
		
	}
	
	public void add()
	{
		int add=a+b;
		System.out.println("the addition is "+add);
	}

}
