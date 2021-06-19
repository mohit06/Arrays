package Array.Reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Kth_MaxAndMinArray {
	
	public static void main(String [] main) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n_k = (br.readLine());
		StringTokenizer st2 = new StringTokenizer(n_k," ");
		int n = Integer.parseInt(st2.nextToken());
		int k = Integer.parseInt(st2.nextToken());
		String in = br.readLine();
		
		StringTokenizer st = new StringTokenizer(in," ");
		int arr[] = new int[n];
		int i=0;
		while(st.hasMoreTokens()) {
			arr[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		Arrays.sort(arr);
		int min = arr[k-1];
		int max = arr[n-k];
		
		System.out.println(k + "th "+"Max: "+max+" "+k+"th Min :"+min);
		
	}

}
