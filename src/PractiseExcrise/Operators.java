package PractiseExcrise;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Arithmetic operators
		int i = 20;
		int j = 10 + i;
		int n = i  + j;
		System.out.println(n);
		System.out.println(n - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);
		System.out.println(++i);
		System.out.println(--j);
// Assignment operators
		int m = 8;
		System.out.println(m += 3);//m=m+3
		System.out.println(m -= 2);//m=m-2
		System.out.println(m *= 2);//m=m*2
		System.out.println(m /= 2);//m=m/2
		System.out.println(m %= 2);//m=m%2
		m = 6;
		System.out.println(m &= 3);//m=m/3
		m = 4;
		System.out.println(m |= 2);//m=m|2
		System.out.println(m ^= 2);
		m = 5;
		System.out.println(m >>= 3);
		m=5;
		System.out.println(m <<= 3);
	// comparison operators
		int x = 5;
		int y = 3;
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x < y);
		System.out.println(x > y);
		System.out.println(x <= y);
		System.out.println(x >= y);
	// Logical operators
		 x = 8;
		 System.out.println(x>5 && x<10);
		 System.out.println(x<5 || x<10);
		 System.out.println(!(x<5 && x>10));
		
		
		
		
		
	}

}
