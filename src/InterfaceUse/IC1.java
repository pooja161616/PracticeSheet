package InterfaceUse;

public class IC1 implements xyz,x1y1z1{

	public static void main(String[] args) {
		
	}

	@Override
	public void cooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void singing() {
		
		x1y1z1.super.singing();
		xyz.super.singing();
	}

	

}
