package java1;

public class StringClass {
	public static void main(String[] args) {
		String p = " nihanth";
		System.out.println(p.charAt(2));
		/*for(int i=0;i<p.length();i++)
			
		{
			System.out.println(p.charAt(i));
			
		}*/
		System.out.println(p.trim());
		System.out.println(p.indexOf("a"));
		System.out.println(p.substring(3));
		System.out.println(p.substring(3, 5));
		System.out.println(p.concat(" pavani srikanth"));
		System.out.println(p.length());
		System.out.println(p.toUpperCase());
		System.out.println(p.toLowerCase());
	    System.out.println(p.split("a")[0]);
	    System.out.println(p.split("a")[1]);
	    System.out.println(p.replace("n", "s"));
	    System.out.println(p.replaceAll("nihanth", "pavani"));
		
	}
}
