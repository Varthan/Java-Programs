// Sample Input : aaa21344454334weee1e4t

// Sample Output : a32134354324we31e4t

// Coding :
  
  import java.util.*;
  public class ABC
  {
	public static void main (String[] args) throws Exception
	{
	    Scanner s=new Scanner(System.in);
	    String in=s.next();
	    int n=0;
	    String out = "";
	    int count=1;
	    
	    while(n<in.length())
	    {
	    	count=0;
	        for(int i=n;i<in.length();i++)
           	{
                	if(in.charAt(n)==in.charAt(i))
                    		count++;
                	else
                    		break;
            	}
            	if(count>1)
            	{
                	out = out + Character.toString( in.charAt(n)) + count;
                	n+=count;
            	}
    
            	else
            	{
                	out = out + Character.toString( in.charAt(n));
                	n++;
            	}
	    }
	    System.out.println("Input : " + in);
            System.out.println("Output : " + out);
	}
}
