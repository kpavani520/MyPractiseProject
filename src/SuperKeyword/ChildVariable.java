package SuperKeyword;

public class ChildVariable extends ParentVariable {
String name = "Pavani";
	public void getString() {
	System.out.println(name);
	System.out.println(super.name);

}
String n1="hai";
	public static void main(String[] args) {
		ChildVariable cs=new ChildVariable();
		cs.getString();
		System.out.println(cs.n1);
		
	}
	
}
