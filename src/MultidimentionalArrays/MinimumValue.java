package MultidimentionalArrays;

public class MinimumValue {
	public static void main(String[] args) {
		
		int m[][] = {{2, 4, 5},{3, 4, 7},{1, 2, 9}};
		int min =m[0][0];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				if(m[i][j]<min) {
					System.out.println(m[i][j]);
					
				}
			}
		}
		
	}

}
