package ThisandSuperKeyword;

public class SuperClass extends ClassB  {
	
	int x=200;// Non static Global Variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass sc=new SuperClass();
		sc.test();

	}
	public void test()
	{
		int x=20;//Local variable
		int sum=x+50;
		System.out.println("The sum of Local variable is "+sum);
		
		int sum1=this.x+500;//To accesss global var from same class
		System.out.println("The sum Global variable is "+sum1);
		System.out.println("The value of Global variable x is "+this.x);
		
		//Super keyword used To call Global variable from another class
		System.out.println("The value of Global variable form another class is "+super.x);
		int sum2=super.x+this.x;
		System.out.println("The value of Global variable from same +another class is"+sum2);
	}

}
