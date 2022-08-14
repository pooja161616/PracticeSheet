package ArrayStudy;

public class NameRevOrderUsingArray {

	public static void main(String[] args) {
		// Print Name and surname in reverse order
		
		/*String Name[]= {"Pooja","Devadiga"};//Declar+Intialization
		
		for(int i=0;i<=Name.length-1;i++)//Dynamic coding
		{
			System.out.println(Name[i]);
		}
		System.out.println("=======================");
		for(int i=0;i<=1;i++)//Static coding
		{
			System.out.println(Name[i]);
		}*/
		
		String Name1[]= {"Pooja","Devadiga"};
		for(int i=0;i<=Name1.length-1;i++)
		{
			System.out.println(Name1[i]);
		}
		
		System.out.println("###############################");
		
		for(int i=Name1.length-1;i>=0;i--)
		{
			System.out.println(Name1[i]);
		}
	}

}
