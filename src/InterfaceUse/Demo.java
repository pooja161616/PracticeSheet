package InterfaceUse;

public interface Demo {
	
	default void show() {
		
		System.out.println("Demo's show");
	}

}
