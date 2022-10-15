package Pkg_1;
public class Narayan {
		public int sum(int a, int b)
		{
			int c;
		    c=a+b;
		    System.out.println("The value is"+c);
		    return c;
		}
		public int sub(int x, int y)
		{
			int z;
			z=x*y;
			System.out.println("The value is"+z);
			return z;
		}
		public int sum1(int x, int y)
		{
			int z;
			z=x+y;
			System.out.println("The value is"+z);
			return z;
		}
		public int mul(int x, int y)
		{
			int z;
			z=x*y;
			System.out.println("The value is"+z);
			return z;
		}
		public void div(int x, int y)
		{
			int z;
			z=x/y;
			System.out.println("The value is"+z);
		}
		public static void main(String[] args) {
			Narayan n1 = new Narayan();
			int sumresult = n1.sum(10,2);
			int subresult =n1.sub(sumresult, 2);
			int summresult=n1.sum1(subresult, 2);
			int multiresult=n1.mul(summresult, 2);
			n1.div(multiresult, 2);
					
		}
	}
