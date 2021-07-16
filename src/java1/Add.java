package java1;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Addition of 2 numbers using scannner
		int num1 , num2 , sum;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		num2 = sc.nextInt();
		sc.close();
		sum = num1 + num2;
		System.out.println("The Result is " +sum);
		
		
		
	}

}
