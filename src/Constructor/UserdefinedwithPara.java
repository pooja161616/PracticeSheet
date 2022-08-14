package Constructor;

public class UserdefinedwithPara {
	// variable declaration Globally
	int a;
	int b;
	
public UserdefinedwithPara(int x,int y)//Constructor with parameter
{
	a=x;
	b=y;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//object created for same class
		UserdefinedwithPara u=new UserdefinedwithPara(50, 20);
		u.addition();
		
		
		
	}
	
	public void addition()//Non static Method without parameter
	{
		
		int add=a+b;
		System.out.println("Addition is "+add);
	}

}