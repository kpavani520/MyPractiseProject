package AbstractClassMethods;

public class ChildNonAbstractClass extends ParentAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildNonAbstractClass a=new ChildNonAbstractClass();
		a.engine();
		a.saftyguidlines();
		a.color();
				
				

	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("The color is Red");
		
	}

	
}
