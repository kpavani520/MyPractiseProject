package java1;

public class Char {

	
		public String backAround(String str) {
			String last = str.substring(str.length() - 4);
			  return last + str + last;
			
			}
public static void main(String[] args) {
	Char c=new Char();
	System.out.println(c.backAround("Nihanth"));
}
	}


