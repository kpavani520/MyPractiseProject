package java1;

public class ObjectCreationForMethod {
	public void getData() {
		System.out.println("1St Method Calling");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Method calling in the same class//
		ObjectCreationForMethod fc=new ObjectCreationForMethod();
fc.getData();
//calling method from MyDataTypes class to ObjectCreationForMethod class//
MyDataTypes sc=new MyDataTypes();
sc.add();
	}

}
