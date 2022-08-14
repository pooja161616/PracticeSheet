package Methods;

public class NonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For non static method object declaration is first step
		//classname objectname=new classname();
		NonStaticMethod n=new NonStaticMethod();
		//declare method name inside main --->objectname.class name
		n.test();
		//Non static method from another class
		Nonsample S=new Nonsample();//object declaration
		S.display();
		
	}
	
	//Non static regular method declaration in same class
	public void test()
	{
		System.out.println("This is test mehod of nonstatic method of same class");
	}
	

}
