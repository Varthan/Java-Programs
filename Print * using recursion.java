import java.io.*;

class swap {
	public static void main (String[] args) 
	{
	    fun(5);
	}
	
	public static String fun(int val)
	{
	    if(val<=0) return "";
	    String out = fun(val-1);
	    out = out + "*";
	    System.out.println( out);
	    return out;
	}
}


/*

OUTPUT: 
*
**
***
****
*****

/*
