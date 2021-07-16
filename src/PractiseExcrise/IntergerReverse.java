package PractiseExcrise;

public class IntergerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 786;
		int r = 786%10;// 6
		i =i/10; //78
		r = r*10 + i%10;//60+8 = 68
		i = i/10; // 7
		r = i +r*10; // 7 + 680 = 687
		System.out.println(r);
		
		int k =34575;
		int result=0;
		while(k>0) {
			result = result*10 + k%10;
			k=k/10;
			System.out.println(result);
			System.out.println(k);
		}
		System.out.println(result);
	}
	

}
