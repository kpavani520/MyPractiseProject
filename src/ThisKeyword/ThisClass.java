package ThisKeyword;

import Array.Example1;

public class ThisClass {
	String name = "Nihanth";
	int a =10;
	public void getString() {
		String name = "pavani";
		int a = 20;
		int c = a+this.a;
		
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(c);
		System.out.println(name + " "+this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisClass tc=new ThisClass();
		tc.getString();

	}


}
