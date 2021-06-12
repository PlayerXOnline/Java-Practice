class Pentagonal
{
	private void print()
	{
		int i, a=0;

		for(i=1;i<=10;i++)
		{
			a+=i;
			System.out.print(a + ", ");
		}
	}

	public static void main(String[] Args)
	{
		Pentagonal pg = new Pentagonal();
		pg.print();
	}
}