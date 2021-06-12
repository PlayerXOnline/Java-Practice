import java.util.*;
class MenuDriven
{
	private static int triangle(int a, int b)
	{
		return(a*b/2);
	}

	private static int rectangle(int a, int b)
	{
		return(a*b);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
  		int ch, h, b1, l, b2;

		System.out.println("Enter \n 1. Area of triangle \n 2. Area of rectangle");
		ch = sc.nextInt();

		switch(ch)
		{
			case 1:
			System.out.println("Enter the base and perpendicular of triangle");
			b1 = sc.nextInt();
			h = sc.nextInt();
			System.out.println("The area of the triangle is " + triangle(b1, h));
			break;

			case 2:
			System.out.println("Enter the length and breadth of the rectangle");
			l = sc.nextInt();
			b2 = sc.nextInt();
			System.out.println("The area of rectangle is " + rectangle(l, b2));
			break;

			default:
			System.out.println("Wrong Option");
		}
	}
}