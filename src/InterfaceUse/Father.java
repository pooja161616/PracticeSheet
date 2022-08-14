package InterfaceUse;

public interface Father {
	void care();
	default void money()
	{
		System.out.println("Fathers money");
	}
	

}
