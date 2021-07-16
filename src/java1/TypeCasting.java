package java1;

public class TypeCasting {
	public static void main(String[] args) {
		//widening casting is converting smaller size data type to larger  size it is done automatically
		int mynum =20;
		double mynum2= mynum;
		System.out.println(mynum);
		System.out.println(mynum2);
		//narrowing Casting is converting larger size data type to smaller size and it should be done manually like
		double mydouble = 8.76;
		int num = (int) mydouble;
		System.out.println(mydouble);
		System.out.println(num);
		
		
		
	}

}
