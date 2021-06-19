package Array.Reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MaxAndMinArray {
	
	public static int [] findMaxMin(int [] arr, int n) {
		int t = arr[0];
		int m = arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]>t) {
				t=arr[i];
			}
			if(arr[i]<m) {
				m=arr[i];
			}
		}
		int a[] = new int[2];
		a[0]=t;
		a[1]=m;
		
		return a;
	}
	
	public static void main(String [] main) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String in = br.readLine();
		StringTokenizer st = new StringTokenizer(in," ");
		int arr[] = new int[n];
		int i=0;
		while(st.hasMoreTokens()) {
			arr[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		int a[]=findMaxMin(arr,n);
		int max = a[0];
		int min = a[1];
		
		System.out.println("Max: "+max+" Min :"+min);
		
	}

}
