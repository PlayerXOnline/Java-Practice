import java.util.*;
class Pattern2
{
	private static void pp1()
	{
		int i, j;

		for(i=1;i<=9;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void pp2()
	{
		int i, j;

		for(i=8;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] Args)
	{
		pp1();
		pp2();
	}
}