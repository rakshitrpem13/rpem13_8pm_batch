package Pkg_1;
public class Para {
		public void method()
		{
			this.method3();
			System.out.println("default parameterized");
			this.method4();
			this.method2();
			this.method1();
		}
		public void method1()
		{
			System.out.println("one parameterized");
		}
		public void method2()
		{
			System.out.println("two parameterized");
		}
		public void method3()
		{
			System.out.println("three parameterized");
		}
		public void method4()
		{
			System.out.println("four parameterized");
		}
		
	public static void main(String[] args) {
		Para npr=new Para();
		npr.method();
	}
	}