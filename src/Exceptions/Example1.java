package Exceptions;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int b=7;
		//int c=0;
		try
		{
			//int k = b/c;
			//System.out.println(k);
			int arr[]=new int[5];
			System.out.println(arr[7]);
		}
		
/*catch(ArithmeticException ae)
{
	System.out.println("I catch Arithmetic exception");
}
		
		catch(IndexOutOfBoundsException iob)
		{
			System.out.println("I catch Index out of bound exception");
		}
		catch(Exception e)
		{
			System.out.println("I catch Exception");
		}*/
		finally
		{
			System.out.println("delete cookies");
		}
	}

}
