/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,hr,min,n2,m1,m2;
		Scanner s = new Scanner(System.in);
		n1 = s.nextInt();
		n2=s.nextInt();
		m1=s.nextInt();
		m2=s.nextInt();
		hr=Math.abs(n1-m1);
		min=Math.abs(n2-m2);
		System.out.println(hr+" "+min);
		
	}
}
