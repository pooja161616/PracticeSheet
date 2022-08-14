package Constructor;

public class Constructorwithpara {
	//variable declaration
	int x;
	int y;
	public Constructorwithpara(int a,int b)
	{
		x=a;
		y=b;
	}
	public void add()
	
	{
		int add=x+y;
		System.out.println("the addition is "+add);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorwithpara cp=new Constructorwithpara(20, 30);
		cp.add();

	}

}
