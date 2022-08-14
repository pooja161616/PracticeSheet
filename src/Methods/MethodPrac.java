package Methods;

public class MethodPrac {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(80, 30);//static method with parameter
		MethodPrac m=new MethodPrac();
		m.sub(80, 10);
		m.sub();
		

	}
	public static void add(int a,int b)//static method with parameter
	{
		int add=a+b;
		System.out.println("Addition is "+add);
	}
	public static void add()//static method without parameter
	{
		int a=20;
		int b=30;
		int add=a+b;
		System.out.println("Addition is "+add);
	}
	public void sub(int p,int q)//non-static method with parameter
	{
		int sub=p-q;
		System.out.println("Substraction is "+sub);
		
	}
	public void sub()//Non-static method without parameter
	{
		int a=20;
		int b=30;
		int sub=a-b;
		System.out.println("Substraction  is "+sub);
	}

}