package java1;

public class SumMultiplies {
	public int sum(int n) {
		
		int result = 0;
		for(int i = 1;i<=n;i++) {
			if (i%3==0 && i%5==0) {
				result +=i;
			}
		}
			return  result;
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumMultiplies sm= new SumMultiplies();
		System.out.println(sm.sum(50));

		
		}

	}

	

