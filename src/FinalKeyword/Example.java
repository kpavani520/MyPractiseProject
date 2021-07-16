package FinalKeyword;

public class Example {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*If we keep final keyword before the variables and we change the values it give us an error that 
		"The final local variable name cannot be assigned. It must be blank and not using a compound assignment"*/

		final int i =10;
		//i=15;
		System.out.println(i);
		
		final String name ="Nihanth";
		//name = "Pavani";
		System.out.println(name);

	}

}
