/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{    int n;
	Scanner s=new Scanner(System.in);
	     n=s.nextInt();	
		
		
                 
                 
                 
    
	     int arr[]= new int[n];
	     int i,k;
	     
	     
	     for(i=0;i<n;i++)
	     {
	     	arr[i]=s.nextInt();
	     }
	     
	
	     k=arr[0];
	     for(i=0;i<n;i++)
	     {
	     	if(arr[i]>k)
	     	{
	     	k=arr[i];
	     	}
	     	 
	     }
	     System.out.println(k);
	}
}
