package Array.Reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Kth_MaxAndMinArray {
	
	//Lets create union to be sorted as well.
	public static ArrayList<Integer> Union(int arr1 [] , int arr2[], int s1, int s2){
		ArrayList<Integer> union = new ArrayList<Integer>();
		int big_size = s1;
		int small_size = s2;
		if(big_size < small_size) {
			big_size = small_size;
			small_size = s1;
		}
		int i,j;
		for( i=0,j=0;i<small_size && j<small_size;) {
			if(arr1[i]<arr2[j]) {
				union.add(arr1[i]);
				i++;
			} else {
				union.add(arr2[j]);
				j++;
			}
		}
		for(int m = i; m < s1; m++) {
			union.add(arr1[m]);
		}
		for(int m = j; m < s2; m++) {
			union.add(arr2[m]);
		}
		return union;
	}
	
	public static ArrayList<Integer> Intersection(int arr1[], int arr2[], int s1, int s2){
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				if(arr1[i]==arr2[j]) {
					intersection.add(arr1[i]);
				}
			}
		}
       
		
		
		return intersection;
	}
	
	public static void main(String [] main) throws NumberFormatException, IOException  {
	    
		
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	          StringTokenizer st = new StringTokenizer(br.readLine()," ");
	          int s1 = Integer.parseInt(st.nextToken());
	          int s2 = Integer.parseInt(st.nextToken());
	          int [] arr1 = new int[s1];
	          int [] arr2 = new int[s2];
	          ArrayList<Integer> union = new ArrayList<Integer>();
	          ArrayList<Integer> intersection = new ArrayList<Integer>();
	          StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
	          for(int i=0;i<s1;i++) {
	        	  arr1[i] = Integer.parseInt(st2.nextToken());
	          }
	          StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
	          for(int i=0;i<s2;i++) {
	        	  arr2[i] = Integer.parseInt(st3.nextToken());
	          }
	          union = Union(arr1,arr2,s1,s2);
	          intersection = Intersection(arr1,arr2,s1,s2);
	          System.out.println(union);
	          System.out.println(intersection);
	}

}
