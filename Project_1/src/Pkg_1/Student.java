package Pkg_1;

public class Student {
		int a;
		int b;
		
	public void display()
	{
		System.out.println("welcome to all of you");
	}
	public void display1()
	{
		System.out.println("Automation is easy");
	}
	public static void main(String[] args) {
		Student a1 = new Student();
		a1.display();
		a1.display1();
		a1.a=123;
		a1.b=123;
		System.out.println(a1.a);
		System.out.println(a1.b);
	}
	}

