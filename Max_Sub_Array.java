package Array.Reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Kth_MaxAndMinArray {
	
	
	public static void main(String [] main) throws NumberFormatException, IOException  {
	    
		
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	          int n = Integer.parseInt(br.readLine());
	          int arr[] = new int[n];
	          StringTokenizer st = new StringTokenizer(br.readLine()," ");
	          for(int i=0;i<n;i++) {
	        	  arr[i] = Integer.parseInt(st.nextToken());
	          }
	          
	          int [][] mat = new int[n][n];
	          
	          for(int i=0;i<n;i++) {
	        	  for(int j=0;j<n;j++) {
	        		  mat[i][j] = 0;
	        	  }
	          }
	          int sum=0;
	          for(int i=0,k=0;i<n && k<n;i++) {
	        	  for(int j=i;j<n;j++) {
	        		  sum = sum + arr[j];
	        		  mat[k][j]=sum;
	        	  }
	        	  k++;
	        	  sum=0;
	          }
	          
	          //printing the matrix
	          //for(int i=0;i<n;i++) {
	        	//  for(int j=0;j<n;j++) {
	        		//  System.out.print(mat[i][j]+" ") ;
	        	  //}
	        	 // System.out.println() ;
	         // }
	          
	          int max=0;
	          int start=0,end=0;
	          for(int i=0;i<n;i++) {
	        	  for(int j=0;j<n;j++) {
	        		 if(mat[i][j]>max) {
	        			 max=mat[i][j];
	        			 start=i;
	        			 end=j;
	        		 }
	        	  }
	        
	          }
	          
	          System.out.println("Maximum sub-Array sum is "+max) ;
	          System.out.println("The sub-Array with maximum sum is: ");
	          for(int i=start;i<=end;i++) {
	        	  System.out.print(arr[i]+" ") ;
	          }
	          
	}

}
