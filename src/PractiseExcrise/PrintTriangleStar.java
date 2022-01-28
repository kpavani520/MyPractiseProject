package PractiseExcrise;

public class PrintTriangleStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print(10);
	}
	static void Print(int row) {
	for(int i=0;i<row;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}

}
