package ThisandSuperKeyword;

//this keyword is use to  access Global variable from same class/current class

public class ThisUse {
	
	int x=20;//Non-static Global Variable
	int y=50;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisUse tu=new ThisUse();
		tu.output();
		
		
	}
	public void output()
	{
		int x=150;//non-static Local Variable
		int sum=x+50;
		System.out.println("Local value of x is "+x);
		
		int sum1=this.x+200;
		System.out.println("The sum of Global variable is "+sum1);
		System.out.println("Global value of x is "+this.x);
	}

	
}
