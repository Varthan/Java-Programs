//  Input :   1 9	4	2	8	3	
//  Output :  2 0	8	3	9	4


import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input (0 to exit)");
		int in[] = new int[100];
		int out[] = new int[100];
		int sort[] = new int[100];
		int inp = sc.nextInt();
		int count = 0, temp = 0;
		while(inp != 0 )
		{
		    sort[count] = inp;
		    count++;
		    inp = sc.nextInt();
		}
		
		for(int j=0; j<count; j++)
		{
		    in[j] = sort[j];
		}
    
		// Sorting
		for (int i = 0; i < count; i++) 
                {
                    for (int j = i + 1; j < count; j++) 
                    {
                        if (sort[i] > sort[j]) 
                        {
                            temp = sort[i];
                            sort[i] = sort[j];
                            sort[j] = temp;
                        }
                    }
                }

                //searching
                for (int i = 0; i < count; i++) 
                {
                    for (int j = 0; j < count; j++) 
                    {
                        if (in[i] == sort[j]) 
                        {
                            out[i] = sort[j+1];
                            break;
                        }
                    }
                }
		
		System.out.println("Input");
		for(int j=0; j<count; j++)
		{
		    System.out.print(in[j]+"\t");
		}
		
// 		System.out.println("\nSort");
// 		for(int j=0; j<count; j++)
// 		{
// 		    System.out.print(sort[j]+"\t");
// 		}
		
		System.out.println("\nOutput");
		for(int j=0; j<count; j++)
		{
		    System.out.print(out[j]+"\t");
		}
	}
}
