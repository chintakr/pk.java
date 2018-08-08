/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for (char c : str.toCharArray())
              {
                    if (!Character.isDigit(c))
                    {
                    System.out.println("no");
                    break;
                    }
                    else
                     {
                       System.out.println("yes");
                      break;
                     }
               }
	}
}
