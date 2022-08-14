package ArrayStudy;

public class ArrayEg1 {

	public static void main(String[] args) {
		// 1.Array Declaration with capacity
		String Name[]=new String[3];
		Name[0]="Poo";
		Name[1]="Japoo";
		Name[2]="Pooja";
		System.out.println(Name[0]);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//to store string in increasing order
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(Name[i]);
		}
		System.out.println("===============================");
		for(int i=2;i>=0;i--)
		{
			System.out.println(Name[i]);
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//Array declaration and initialization in single line
		
		String City_Name[]= {"Pune","Goa","Daman","Dehu"};
		System.out.println(City_Name[3]);
		System.out.println("===============================");
		//string in increasing order using Dyanamic testing
		for(int i=0;i<=City_Name.length-1;i++ )
		{
			System.out.println(City_Name[i]);
		}
		System.out.println("===============================");
		//String in decreasing order 
		for(int i=City_Name.length-1;i>=0;i--)
		{
			System.out.println(City_Name[i]);
		}
		
	}

}
