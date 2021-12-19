package Maven_Projec.Maven_Projec;

public class Unit_TEst {
	
	public static int methodA() {
		int a = 10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public void methodB() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		int finalValue = methodA();
		System.out.println("finalValue:"+finalValue);
	}

}
