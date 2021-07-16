package StaticAndNonStatic;

public class InstanceVariable {
	String name;
	String address;
	static String city;
	static int i;
	static {
		city = "Los Angeles";
		i = 0;
	}
	InstanceVariable(String name,String address){
	
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
		System.out.println(name+ " "+address+ " "+city);
		
	}
		/*public void getData() {
			System.out.println(name+ " "+address+ " "+ city);
			
		}*/
		//static methods uses only static variables//
		public static void getcity() {
			System.out.println(city);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable iv=new InstanceVariable("pavani","West");
		InstanceVariable jv=new InstanceVariable("Srikanth","Fuller");
		InstanceVariable kv=new InstanceVariable("Nihanth","Santa");
		/*iv.getData();
		jv.getData();
		kv.getData();*/
		//static methods and variables are called by using class name instead of objects//
		InstanceVariable.getcity();//static method
		System.out.println(InstanceVariable.i=4);//static variable
		System.out.println(InstanceVariable.city="Santa Clarita");//static variable
		

	}

}
