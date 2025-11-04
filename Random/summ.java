import java.util.*;

class summ
{
	public static void main(String args[])
	{
	    
            double s=0;
	for(String x:args)
	{
	    s+=Double.parseDouble(x);
	}
	    System.out.println(s);	 						
	}
}