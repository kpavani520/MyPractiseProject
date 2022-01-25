package PractiseExcrise;

public class LenghtOfSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=lenghtofsubstring("abcdbb");
		System.out.println("Final output="+s);
		
		
		

	}
	public static String lenghtofsubstring(String s) {
		int n=s.length();
		int len =0;
		String temp=null;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				 String y=s.substring(i, j);
				if(notrepeated(y)) {
					{
						if(y.length()>len) {
							len=y.length();
							System.out.println(y);
							temp =y;
							
						}
					}
				}
			}
		}
		return temp;
		
	}
	public static boolean notrepeated(String x) {
		String temp="";
		for(int i=0;i<x.length();i++) {
			if(!temp.contains(String.valueOf(x.charAt(i)))) {
				temp=temp+x.charAt(i);
			}
			
		}
		if(temp.length()==x.length()) {
			return true;
		}
		return false;
		
	}

}
