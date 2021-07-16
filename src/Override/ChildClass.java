package Override;

public class ChildClass extends ParentClass {
	public void audiosystem() {
		System.out.println("new sound system");
		super.audiosystem();
	}
public static void main(String[] args) {
	ChildClass c = new ChildClass();
	c.audiosystem();
}
}
