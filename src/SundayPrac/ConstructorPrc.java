package SundayPrac;

public class ConstructorPrc {
	int a;
	int b;
	int c;

	public static void main(String[] args) {
		ConstructorPrc CP = new ConstructorPrc();// without parameter
		CP.add();
		ConstructorPrc CP1 = new ConstructorPrc(120, 30);//with parameter
		CP1.add();

	}

	public ConstructorPrc() {
		a = 20;
		b = 30;

	}

	public ConstructorPrc(int x, int y) {
		a = x;
		b = y;
	}

	public void add() {
		int sum = a + b + c;
		System.out.println(sum);
	}

}
