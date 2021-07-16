package java1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "Nihanth";
for(int i=a.length()-1;i>=0;i--)
{
	
	
	System.out.print(a.charAt(3));
	
}
		//for palondroum//
		String s = "madam";
		String t = "";
			
		for(int i=s.length()-1;i>=0;i--) {
			t = t + s.charAt(i);
			
		}

if(t.equals(s)) {
	System.out.println("The string is a palindrome");
}
	else
	{
		System.out.println("The string is not a palindrome");
		
}
	}

}
