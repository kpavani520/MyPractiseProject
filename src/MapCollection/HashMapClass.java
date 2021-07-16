package MapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(0,"Hello ");
hm.put(1, "how");
hm.put(24, "are");
hm.put(3,"you");
System.out.println(hm);
System.out.println(hm.get(0));
//System.out.println(hm.remove(0));
System.out.println(hm.get(0));
System.out.println(hm.isEmpty());
System.out.println(hm.size());
//till now it is an HashMap now we are converting it in to set by creating an object
Set s=hm.entrySet();
//System.out.println(s);
//to traverse
Iterator it=s.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	/*System.out.println("\n");
	//if we want to seperate the key and the values
	Map.Entry mp=(Map.Entry)it.next();
	//System.out.println(mp.getKey());
	System.out.println(mp.getValue());*/
}

	}

}
