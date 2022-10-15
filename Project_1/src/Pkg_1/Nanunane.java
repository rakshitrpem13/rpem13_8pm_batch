package Pkg_1;

public class Nanunane {
		public Nanunane() 
		{
			System.out.println("default parameterized");
		}
		public Nanunane(int a,int b) {
			this(22,32,33);
			System.out.println("two parameterized");
		}
		public Nanunane(int a,int b, int c) {
			System.out.println("three parameterized");
		}
		public static void main(String[] args) {
			Nanunane n=new Nanunane(22,32);
		}
	}
