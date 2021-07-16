package java1;
import java.util.*;
public class StdinStdout {
	

	

	 public static void main(String[] args) {
	        
	        int arr[] ={42 , 100, 125};
	        for(int i=0; i <arr.length;i++){
	        System.out.println(arr[i]);
	    }
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a value:");
	        int a = scan.nextInt();
	        System.out.println("Enter b value:");
	        int b = scan.nextInt();
	        System.out.println("Enter c value:");
	        int c = scan.nextInt();
	        
	        System.out.println(a + "\n" + b + "\n" + c);
	        
	    }
	}

