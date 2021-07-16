package java1;

public class NestedLoop {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*for(int i=1;i<=4;i++)
		{
			System.out.println(i);
			for(int j=1;j<=4;j++)
			{
				System.out.println(j);
			}
			System.out.println(i);
		}
		
		}*/
		// triangle//
		/*int k = 1;
		for(int i=0;i<4;i++)
			
		{
			
			for(int j=1;j<=i+1;j++)
			{
				
				System.out.print(k);
				System.out.print("\t");
				
				k++;
				
			}
			System.out.println(" ");
		}*/
		 int k=3;
		for(int i=0; i<3;i++) {
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
				
			}
			System.out.println("");
		}
		
		
	}
}
			
	

	
