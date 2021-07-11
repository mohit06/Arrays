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
	          for(int i=1;i<n;i++) {
	        	  int j = (i-1) % n;
	        	  int t = arr[i];
	        	  arr[i]=arr[j];
	        	  arr[j]=t;
	        	  
	          }
	          
	          for(int i=0;i<n;i++) {
	        	  System.out.print(arr[i]+" "); 
	          }
	}

}
