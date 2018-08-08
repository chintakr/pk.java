/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,j,num,temp;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		int a[] = new int[num];
		for(i=0;i<num;i++)
		{
			a[i]=s.nextInt();
			
		}
	
		for(i=0;i<num;i++){
			for(j=i+1;j<num;j++)
			{
			if(a[j]<=a[i])
			{
				temp=a[i];
				a[i]=a[j];
			            a[j]=temp;
				
				
			}
		}
	}
	
	for(i=0;i<num;i++)
	{
	System.out.println(a[i]);	
	}
}
}
