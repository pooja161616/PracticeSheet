package InterfaceUse;

public interface xyz {
	void cooking();

	default void singing() {
		System.out.println("Singing is xyz's meyhod");
	}

}
