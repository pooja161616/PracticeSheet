package Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		//m.add();
		m.add(50, 60);

	}
	public void add()
	{
		int a=20;
		int add=50+a;
		System.out.println("Addition is "+add);
	}
	public void add(int a,int b)
	{
		int add=a+50;
		System.out.println("Addition is "+add);
	}

}
