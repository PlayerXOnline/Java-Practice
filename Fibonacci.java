class Fibonacci
{
	private void print()
	{
		int a=0, b=1, i;

		for(i=1;i<=10;i++)
		{
			System.out.print(a + ", ");
			System.out.print(b + ", ");

			a=a+b;
			b=a+b;
		}
	}

	public static void main(String[] Args)
	{
		Fibonacci fb = new Fibonacci();

		fb.print();
	}
}