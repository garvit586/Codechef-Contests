import java.util.*;
import java.lang.*;
import java.io.*;
public class OlympicRanking {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int S1,G1,B1,S2,G2,B2;
		int[] arr = new int[6];
		while(T!=0){
		    G1 = s.nextInt();
		    S1 = s.nextInt();
		    B1 = s.nextInt();
		    G2 = s.nextInt();
		    S2 = s.nextInt();
		    B2 = s.nextInt();
		      //  arr[i] = s.nextInt();
		    
		  //  G1 = arr[0];
		  //  S1 = arr[1];
		  //  B1 = arr[2];
		  //  G2 = arr[3];
		  //  S2 = arr[4];
		  //  B2 = arr[5];
		    int T1 = S1+G1+B1;
		    int T2 = S2+G2+B2;
		    if (T1 > T2){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("2");
		    }
		    
		   
		    T--;
		}
		// your code goes here
	}
}
