package Array.Reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Kth_MaxAndMinArray {
	
	public static void main(String [] main) throws NumberFormatException, IOException  {
	    
		
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      int n = Integer.parseInt(br.readLine());
		      int [] arr = new int[n];
		      
		      StringTokenizer st = new StringTokenizer(br.readLine()," ");
		      for(int i=0;i<n;i++) 
		      {
		    	  if(st.hasMoreElements()) {
		    	      arr[i] = Integer.parseInt(st.nextToken());
		    	  }
		      }
		
		      int temp = -1;
		      for(int i=0;i<n;i++) {
		    	  if(arr[i]<0) {
		    		  temp++;
		    		  int x = arr[temp];
		    		  arr[temp]=arr[i];
		    		  arr[i]=x;
		    	  }
		      }
		      
		      for(int i=0;i<n;i++)
		      System.out.print(arr[i]+" ");
		      
			}

}
