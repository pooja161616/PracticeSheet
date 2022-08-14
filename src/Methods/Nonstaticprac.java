package Methods;

public class Nonstaticprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classname objectname=new classname();
		NonStaticMethod n=new NonStaticMethod();//created object of class
	     n.test();//To call non-static method from same class--->objectname.methodname();
        Nonstaticdiff d=new Nonstaticdiff();//object created for different class
        d.substraction();//To call non static method from different class
        
	}
 
	public void test()
	{
		int a=25;
		int b=35;
		int add;
		add=a+b;
		System.out.println("Nonstatic add method addition is "+add);
	}
}
