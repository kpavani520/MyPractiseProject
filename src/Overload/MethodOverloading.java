package Overload;

public class MethodOverloading {
	public void getData(int a) {
		System.out.println(a);
	}
public void getData(int a, int b) {
	System.out.println(a+b);
}
	

public static void main(String[] args) {
	MethodOverloading m = new MethodOverloading();
	m.getData(2);
	m.getData(2+10);
}
}
