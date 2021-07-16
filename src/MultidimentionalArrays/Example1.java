package MultidimentionalArrays;

import java1.WhileLoop;

public class Example1 {
	int i = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[][]=new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;*/
		int a[][]= {{2, 4, 5},{3, 4, 7}};
		for(int i=0;i<a.length;i++)
			
		{
			for(int j=0;j<=a.length;j++) {
				
			
			System.out.print(a[i][j]);
			System.out.print("\t");
			}
			System.out.println("");
		}
		System.out.println("");
		
int b[][]= {{2, 4, 5},{3, 4, 7},{1, 2, 9}};
for(int i =0;i<b.length;i++) {
	for(int j=0;j<b.length;j++) {
		
			System.out.print(b[i][j]);
			System.out.print("\t");
		}
	System.out.println("");
	
	}
//minimum value//
System.out.println(b[2][0]);
WhileLoop wl=new WhileLoop();


}
	}

