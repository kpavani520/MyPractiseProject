package java1;

public class AppleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple ap1=new Apple();
		ap1.setColor("red");
		System.out.println(ap1.getColor());
		
		Apple ap2=new Apple();
		ap2.setColor("red");
		System.out.println(ap2.getColor());
		
		if (ap2.equals(ap1)) {
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		

	}

}
