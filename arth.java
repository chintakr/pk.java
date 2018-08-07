/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t=0;
		int n,a,d;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		a = s.nextInt();
		d = s.nextInt();
		t = (n*(2*a+(n-1)*d)/2);
		System.out.println(t);
	}
}
