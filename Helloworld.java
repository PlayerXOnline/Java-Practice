import java.util.Scanner;	
class Helloworld
{
	void print(int a)
	{
		switch(a)
		{
			case 1:
			System.out.println("Name : Amitabha Sarkar");
			break;
			case 2:
			System.out.println("Program name : Helloworld");
			break;
			case 3:
			System.out.println("Program Purpose : To Practice vim and java");
			break;
			case 4:
			return;
													default:
			System.out.println("Unidentified Command");
		}	

	} 
	public static void main(String[] args)
	 {	 
		 Scanner sc = new Scanner(System.in);
	     	 Helloworld am = new Helloworld();		
                 int i;
		 System.out.println("Enter: \n 1 for Name of Coder \n 2 for Name of Program \n 3 for Name the purpose of the program \n 4 to terminate Program ");
		 do
		 {
		  	i = sc.nextInt();		 
		 	am.print(i);
		 }
		 while(i != 4);
	 }
}
