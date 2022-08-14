package SundayPrac;

public class ProgramPrcAll {

	public static void main(String[] args) {

		// call NS method from diff. class
		Nonstaticclass NS = new Nonstaticclass();

		NS.Demo();
		System.out.println("==============================================");

		// to call non static method(same class) create obj of class

		ProgramPrcAll p = new ProgramPrcAll();
		System.out.println("add of non static method is");
		p.add();
		System.out.println("=========================");

		// to call static method we need create method name in main method
		System.out.println("Substarction of static method is ");
		sub();
		System.out.println("===================");

		// Variable study
		int a = 10;// Variable decl + initkialization
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
		System.out.println("=====================");

	}

	// Static method
	public static void sub() {
		int a = 120;
		int b = 100;
		int sub = a - b;
		System.out.println(sub);
	}

	// Non static method declaration
	public void add() {
		int a = 15;
		int sum1 = a + 150;
		System.out.println(sum1);
	}

}
