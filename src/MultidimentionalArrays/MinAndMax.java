package MultidimentionalArrays;

public class MinAndMax {
	public static void main(String[] args) {
		int m[][]= {{2, 4, 5},{3, 0, 7},{1, 2, 9}};
		int min = m[0][0];
		int mincolumn = 0;
		for (int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				if(m[i][j]<min) {
					min=m[i][j];
					System.out.println("min value="+min);
					  mincolumn =j;
					
				     System.out.println("miniumu column="+mincolumn);
				}
				
			}
		}
		
		
		
		int max=m[0][mincolumn];
	for(int k=0;k<3;k++) {
			if(m[k][mincolumn]>=max) {
				max=m[k][mincolumn];
				System.out.println("max value="+max);
			}
		
		
		}
	Example1 e=new Example1();
	e.i = 10;
		}
		
		
	}


