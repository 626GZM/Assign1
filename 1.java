import java.util.Scanner;
public class Main {
	static int origin;
	static int num;
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		origin=num;
		in.close();
		System.out.println(num);
		up(num);
		System.out.println(num);
		down(num);
	}
	public static void up(int n)
	{
		if(n>=5000)
		{
			num=n;
			return;
		}
		System.out.println(n*=2);
		up(n);
	}
	public static void down(int n)
	{
		if(n==origin)
		{
			return;
		}
		System.out.println(n/=2);
		down(n);
	}
}
