**Sample Input 1 :** hElLo woRlD

**Sample Output 1 :** Hello World
	
  
**Sample Input 2 :** weLCoMe everYonE

**Sample Output 2 :** Welcome Everyone


##Coding : 

import java.util.Scanner;
public class HelloWorld 
{
    public static void main(String []args) throws Exception
    {
        Scanner scan = new Scanner(System.in); 
        String in = scan.nextLine();
        String out = "";
        
        if(((int) in.charAt(0)) >= 97 && ((int) in.charAt(0)) <= 122)
            out += (char) (((int) in.charAt(0)) - 32);
        else
            out += in.charAt(0);
        
        for(int i=1;i<in.length();i++)
        {
            if(((int) in.charAt(i)) == 32)
            {
                out += (char)32;
                
                if((int) in.charAt(i+1) >= 97 && ((int) in.charAt(i+1)) <= 122)
                    out += (char) ( ( (int) in.charAt(i+1) ) - 32 );
                else
                    out += in.charAt(i+1);
                    
                i++;
            }
            else
            {
                if(((int) in.charAt(i)) >=65 && ((int) in.charAt(i)) <= 90)
                    out += (char) ( ( (int) in.charAt(i) ) + 32 );
                else
                    out += in.charAt(i);
            }
        }
        System.out.println(out);
    }
}
