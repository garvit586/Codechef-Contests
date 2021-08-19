import java.util.*;
import java.lang.*;
import java.io.*;

public class ChargeSheduling {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		if(q>=1&&q<=3*Math.pow(10,5))
		{
		    for(int i=0;i<q;i++)
		    {
		        int n=sc.nextInt();
		        int number[]=new int[n];
		        int num[][]=new int[n][2];
		        int num1[][]=new int[n][2];
		        for(int j=0;j<n;j++)
		        num[j][0]=sc.nextInt();
		        for(int j=0;j<n;j++)
		        num[j][1]=sc.nextInt();
		        int min=Integer.MAX_VALUE,time=0,ind=0,index=0,charge=0;
		        for(int k=0;k<n;k++){
		            min=Integer.MAX_VALUE;
		        for(int j=0;j<n;j++)
		        {
		            if(min>num[j][0])
		            {
		               min=num[j][0]; 
		               ind=j;
		            }
		        }
		        charge+=num[ind][0];
		        
		        if(num[ind][0]<=num[ind][1]&&charge<=num[ind][1]){
		        num1[index][0]=num[ind][0];
		        num1[index][1]=num[ind][1];
		        num[ind][0]=Integer.MAX_VALUE;
		        number[index]=ind;
		        index++;
		        
		        }
		        else
		        {
		            charge-=num[ind][0];
		           num[ind][0]=Integer.MAX_VALUE;
		           
		        }
		        }
		         System.out.println(index);
		        for(int j=0;j<index;j++)
		        {
		           System.out.println((number[j]+1)+" "+time+" "+(time+num1[j][0]));
		           time=time+num1[j][0];
		        }
		    }
		}
	}
}
