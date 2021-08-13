import java.util.*;
import java.lang.*;
import java.io.*;
public class ProblemDifficulties {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int T =s.nextInt();
// 		int A1,A2,A3,A4;
        int[] arr = new int[4];
		while(T!=0){
		  //  A1 = s.nextInt();
		  //  A2 = s.nextInt();
		  //  A3 = s.nextInt();
		  //  A4 = s.nextInt();
		    for (int i=0;i<4 ;i++ ){
		        arr[i] = s.nextInt();
		    }
		    Arrays.sort(arr);
		  //  if (A1 == A2 && A2==A3 && A3==A4){
		  //      System.out.println("0");
		  //  }
		  //  else if ((A1 == A2 && A2==A3)||(A2==A3 && A3==A4)){
		  //      System.out.println("1");
		  //  }
		  //  else{
		  //      System.out.println("2");
		  //  }
		    if (arr[0] == arr[1] && arr[1]==arr[2] && arr[2]==arr[3]){
		        System.out.println("0");
		    }
		    else if ((arr[0] == arr[1] && arr[1]==arr[2])||(arr[1]==arr[2] && arr[2]==arr[3])){
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
