package java1;

public class MyDataTypes {
	public static void main(String[] arg) {
		String text="hello world";
		System.out.println("my string = "+text);
	//System.out.println("Hello world");
		
		int myNum = 100000;
		System.out.println("myNum =" +myNum);
		
		float myFloat=12e4f;
		System.out.println("myFloat =" +myFloat);
		boolean myFirstProgram = true;
		boolean notFirstProgram = false;
		System.out.println("myFirstProgram =" +myFirstProgram);
		System.out.println("notFirstProgram =" +notFirstProgram);
		
		int x = 10;
		x +=5;
		int y = 20;
		System.out.println(x);
		System.out.println(y);
		int result= x + y;
		System.out.println("addition =" + result);
		
		result = y - x ;
		System.out.println("substraction =" + result);
		
		result = x * y;
		System.out.println("multiplication =" + result);
		
		result = y / x;
		System.out.println("division =" + result);
		
		result = y % x;
		System.out.println("reminder =" +result);
		
		result = ++x;
		System.out.println("incriment =" +result);
		
		System.out.println(x);
		
		result = --x;
		System.out.println("decrement =" + result);
		
		byte myValue = 100;
		System.out.println(myValue);
		
		short myNum1 = 5000;
		System.out.println(myNum1);
		
		long myNum2 = 15000000000L;
		System.out.println(myNum2);
		
		double myNum3 = 19.66d;
		System.out.println(myNum3);
		
		char Grade = 'A';
		System.out.println("myGrade =" +Grade);
		
		char a = 65 , b = 66 , c = 67 ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int myInt = 9 ;
		double myDouble = myInt;
		System.out.println(myInt);
		System.out.println(myDouble);
		
		double myDouble1 = 19.66d;
		int myInt1 = (int) myDouble;
		System.out.println(myInt1);
		System.out.println(myDouble1);
		
		System.out.println(x>3 && x<20);
		System.out.println(x>3 || x>20);
		System.out.println(!(x>3 && x<20));
		
		
		
		
	
		
		
		
		
		
	}

	public void add(){
		int c=10;
				int d=20;
				int sum=c+d;
				System.out.println("sum is =" +sum);
	}
				
		
	
}
