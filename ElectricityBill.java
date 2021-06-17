import java.util.Scanner;
class ElectricityBill
{
	String n;
	int u;
	double bill;

	void input()//input name and units consumed
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of customer");
		n = sc.nextLine();
		System.out.println("Enter the number of units consumed");
		u = sc.nextInt();
		
	}

	void calculate()//calculate bill using given charge
	{
		if(u<=100)
			bill = u*2;
		else
		if(u>100 && u<=300)
			bill = 100*2 +(u-100)*3.50;		
		else
		if(u>300)
			bill = 100*2 + 200*3.50 + (u-300)*5; 		
	}

	void print()
	{
		/* Print
		ENERGY BILL
		CONSUMER NAME:
		UNITS CONSUMED
		BILL AMOUNT: RS
		*/ 
		System.out.println("ENERGY BILL");
		System.out.println("CONSUMER NAME: " +n);
		System.out.println("UNITS CONSUMED: " +u);
		System.out.println("BILL AMOUNT: Rs " +bill);
	}
	public static void main(String[] Args)
	{
		/*create n object
		manipulate data
		print a bill
		*/
		ElectricityBill ob = new ElectricityBill();
		ob.input();
		ob.calculate();
		ob.print();
	}
}