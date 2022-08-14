package Even_OddProgramForForLoop;

public class NumberProgram {

	public static void main(String[] args) {
		// Number divisible by 7 from 1 to 100
		
		for(int i=1;i<=100;i++)
		{
			if(i%7==0)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println("==============================================");
		
		//Number divisible by 3 from 1 to 50
		
		for(int a=1;a<=50;a++)
		{
			if(a%3==0)
			{
				System.out.print(a+" ");
			}
		}
		System.out.println();
		System.out.println("==============================================");
		
		//Number divisible by 3,5 and 7 from 1 to 80
		
		for(int c=1;c<=50;c++)
		{
			if(c%3==0 || c%5==0 || c%7==0)
			{
				System.out.print(c+" ");
			}
		}
		System.out.println();
		System.out.println("===============================================");
		
		//Program for even number(1 to 50)
		
		for(int e=1;e<=50;e++)
		{
			if(e%2==0)
			{
				System.out.print(e+" ");
			}
		}
		System.out.println();
		System.out.println("===============================================");
		
		//Program for divisibla by 3,5,7 from 20 to 50
		
		for(int i=20;i<=50;i++)
		{
			
			if(i%3==0 || i%5==0 || i%7==0)
			{
				System.out.print(i+" ");
			}
			
			
		}
		
	
		
	}
	
}
