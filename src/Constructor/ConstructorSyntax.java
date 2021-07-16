package Constructor;

public class ConstructorSyntax {
	static String s="hello";
	
	public ConstructorSyntax() {
		
		System.out.println("This is Constructor Method");
	}

	public ConstructorSyntax(int a, int b) {
		int c=a+b;
		System.out.println("Parametrized Constructor="+ c);
	}
	public ConstructorSyntax(String str) {
		
		System.out.println("string =" +str);
	}

	public void getData() 
	{
		System.out.println("This is a Method");
	}

	public static void main(String[] args) {
		ConstructorSyntax cs = new ConstructorSyntax();
		System.out.println(s);
		ConstructorSyntax c = new ConstructorSyntax(20,30);
		ConstructorSyntax a = new ConstructorSyntax("Nihanth");
		 c.getData();

	}


}