package Array.Reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseArray {
	
	public static int[] reverse(int arr[],int n) {
		int [] temp=new int[n];
		for(int i=0,j=n-1;i<n && j>=0;i++,j--) {
			temp[i]=arr[j];
		}
		return temp;
		
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
		arr = reverse(arr,n);
		for(int j=0;j<n;j++)
		System.out.print(arr[j]+" ");
	}

}
