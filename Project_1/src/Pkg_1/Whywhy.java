package Pkg_1;

public class Whywhy {
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("the value is"+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("the value is"+c);
		return c;
	}
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("the value is"+c);
		return c;
	}
	public int sub1(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("the value is"+c);
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("the value is"+c);
	}
public static void main(String[] args) {
	Whywhy w= new Whywhy();
	int mulanna=w.mul(10, 2);
int subbi=w.sub(mulanna, 2);
int adda=w.sum(subbi, 2);
int subt=w.sub1(adda, 2);
w.div(subt, 2);	
}

}
