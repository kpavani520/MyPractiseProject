package PractiseExcrise;

public class TyoeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// widening casting converting smaller type to larger type
		int num = 5;
		double num1 = num;// Automatic casting
		System.out.println("widening casting int:" + num);// 5
		System.out.println("widening casting to double:" + num1);// 5.0
		System.out.println("\n");
		// Narrowing casting converting larger type to smaller type
		double n1 = 9.67;
		int n2 = (int) n1 ;// Manual casting
		System.out.println("narrowing casting double:" + n1);
		System.out.println("narrowing casting to int:" + n2);

	}

}
