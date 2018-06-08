// To find all Jumbled numbers between the given numbers (Each and every digit have a difference of 1)

// Sample Input : 20000	 ,  22000

// Sample Output : 
// 	Starting point : 20000
//  Ending point : 22000

// Jumbled Numbers :-
// 21010
// 21012
// 21210
// 21212
// 21232
// 21234

// Coding : 

import java.util.*;
Public class ABC
{
	public static void main (String[] args) 
  	{
    		Scanner sn=new Scanner(System.in);
    		int start=sn.nextInt();
		int end=sn.nextInt();
		System.out.println("Starting point : "+start);
		System.out.println("Ending point : "+end+"\n");
		int n;
		int flag;
		System.out.println("Jumbled Numbers :-\n");
		for(int i=start;i<=end;i++)
		{
		    String s=""+i;
		    n=0;
		    flag=1;
		    while(n<s.length()-1)
		    {
		        int v=Integer.valueOf(s.charAt(n))-Integer.valueOf(s.charAt(n+1));
		        if(v>1 || v<-1 || v==0)
		        {
		            flag=0;
		            break;
		        }
		        n++;
		    }
		    if(flag==1)
		        System.out.println(i);
		}
	}
}
