package InterfaceUse;

public class Son implements Father,Mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s =new Son();
		s.care();
		s.love();
		s.money();
		
	}

	@Override
	public void care() {
		System.out.println("Fathers care completed in Son class");
		
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		Father.super.money();
		Mother.super.money();
	}

	@Override
	public void love() {
		System.out.println("Mothers love");
	}



	

	
	
}
