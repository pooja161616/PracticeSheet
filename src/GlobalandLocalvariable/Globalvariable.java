package GlobalandLocalvariable;

public class Globalvariable {
	
	//non static global variable
	int a=10;//variable declaration+initialization
	static int b=20;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Globalvariable gv=new Globalvariable();
		//calling non stativ global variable from same class
		System.out.println("Global value of a is "+gv.a);
		System.out.println("Global value of b is "+b);
		int sum=100+gv.a;
		int sub=100-b;
	}

}
