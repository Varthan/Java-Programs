// Sample Input : jdfabcsh

// Sample Output : abc

// Coding :

 import java.util.*;
 public class ABC
 {
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        String a=sn.next();
        System.out.println("Input Value = "+a);
        for(int i=0;i<(a.length()-2);i++)
        {
            char b = a.charAt(i);
            if((++b)==a.charAt(i+1))
                if((++b)==a.charAt(i+2))
                    System.out.print(a.charAt(i)+""+a.charAt(i+1)+""+a.charAt(i+2)+"\n");
        }
    }
}
