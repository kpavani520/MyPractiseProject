package ListCollection;

import java.util.ArrayList;

public class Example1 {
	//ArrayList,LinkedList,Vector- will implement list interface
	//Array have fixed size, where as ArrayList can grow dynamically
	//we can access and insert any value in any index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a = new ArrayList<String>();
//For adding values
a.add("Nihanth");
a.add("Srikanth");
//all the classes which implement list interface will accept duplicate values/objects
a.add("Nihanth");
System.out.println(a);

//For adding values in perticular index
a.add(1," Pavani");
System.out.println(a);

//for getting values in perticular index
System.out.println(a.get(0));

//for removing values/objets by using index and objects
/*a.remove(1);
a.remove("Pavani");
System.out.println(a);*/

//For checking wheather they contain in the array(true) are not(false)
System.out.println(a.contains("Pavani"));
System.out.println(a.contains("Nihanth"));

//For getting  perticualr index of that object
System.out.println(a.indexOf("Nihanth"));

// to know weather the array is empty(false) are not(true)
System.out.println(a.isEmpty());

//to get the size the array we use
System.out.println(a.size());
	}

}
