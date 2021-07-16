package PractiseExcrise;

public class StringManuplation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// length of a string :
		String text = "hakndkdsvfscjlbdsjcbel";
		System.out.println("The length of a string is :" + text.length());
// to upper case string:	
		String str = "nihanth";
		System.out.println("To uppercase:" + str.toUpperCase());
// to lower case:
		String st = "PAVANI";
		System.out.println("To lower case:" + st.toLowerCase());
// to get index of particular word or letter
		String s = "Hello how are you";
		System.out.println("The index of letter is:" + s.indexOf("l"));
		System.out.println("The index of particular word is:" + s.indexOf("how"));
//string concatenation
		String firstName= "Nihanth";
		String lastName= " Katragadda";
		System.out.println(firstName+ " " +lastName);
		System.out.println(firstName.concat(lastName));
		System.out.println(lastName.indexOf(" "));
//special characters
		String msg ="Nihanth\'s \"dream house \" project.";
		System.out.println(msg);
		String m ="\\ hello \\";
		System.out.println(m);
		String t1 = "Hel\blo";//it deletes l
		String t2 = "World";
		System.out.println(t1 +"\t"+ t2);//gives space
		System.out.println(t1 +"\n"+ t2);//prints 2nd word in new line
		System.out.println(t1 +"\r"+ t2);//prints 2nd word in new line
//adding numbers in the form of strings
		String n1 = "10";
		String n2 = "20";
		System.out.println(n1 + n2);//1020 i.e., string concatenation
//adding string and integer
		int i = 30;
		System.out.println(n2 + i);//2030
//Returns the character at the specified index (position)
		System.out.println(s.charAt(7));
//Returns the Unicode of the character at the specified index
		System.out.println(s.codePointAt(0));
//Returns the Unicode of the character before the specified index
		System.out.println(s.codePointBefore(7));
//Returns the Unicode in the specified text range of this String
		int result = s.codePointCount(0, 10);
		System.out.println(s.charAt(result));
		
		
		
		
	}

}
