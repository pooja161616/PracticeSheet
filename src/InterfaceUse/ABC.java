package InterfaceUse;

public class ABC implements Demo,Mydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC a=new ABC();
		a.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Demo.super.show();
		Mydemo.super.show();
	}

}
