package Pkg_1;

public class Stat {

		public void arithematic(int a,int b) 
		{
			int c;
		    c=a+b;
		    System.out.println("sum of result is"+c);
		}
		public int arithematic(int x,int y,int z) 
		{
			int p;
			p=x+y+z;
			System.out.println("sum of result is"+p);
			return p;
		}
		public static void main(String[] args) 
		{
			Stat ob=new Stat();
			ob.arithematic(22,33);
			ob.arithematic(11,55,44);
		}
	}
