import java.util.*;
class Program26
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        String wond[] = new String[7];

        int i,f;
        String cty;
                
        System.out.println("Enter 7 continents");
        for(i=0;i<7;i++)
        {
            wond[i]=in.next();
        }
        System.out.println("\n");
	for(i=0;i<7;i++)
	{
		System.out.println(wond[i]);
	}	
	System.out.println("\n Enter the continent to be searched");
        cty=in.next();
        f=0;
        for(i=0;i<7;i++)
        {
            if(cty.equals(wond[i]))
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("Search successful");
            System.out.println(cty + " was found");
        }
        else
        System.out.println("Search unsuccessful, no such location is found in the list");
    }
}
        
            
        
