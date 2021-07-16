package Inheritance;

//import java1.Apple;

public class Child extends Parent1{

	int i=100;

	String name ="QAClickAcademy";

public void getStringdata()
{
System.out.println(name);

}


public void getData()
{

System.out.println("I am in child class");
}
public static void main(String[] args) {
// TODO Auto-generated method stub



Parent1 cd = new Child();
System.out.println(cd.i);
cd.getStringdata();
cd.getData();
}

}