package Array.Reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;


public class Kth_MaxAndMinArray {
	
	public static void main(String [] main) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = (br.readLine());
		Map<StringBuilder, Integer> map = new TreeMap<StringBuilder,Integer>();
		int zero=0, one=0, two=0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='0') {
				zero++;
			}
			if(str.charAt(i)=='1') {
				one++;
			}
			if(str.charAt(i)=='2') {
				two++;
			}
		}
		

		map.put(new StringBuilder("0"), zero);
		map.put(new StringBuilder("1"), one);
		map.put(new StringBuilder("2"),two);
		
		StringBuilder str2 = new StringBuilder();
		for(Map.Entry<StringBuilder, Integer> entry : map.entrySet()) {
			String key = entry.getKey().toString();
			int value = entry.getValue();
			for(int i=0;i<value;i++) {
				str2.append(key);
			}
		}
		System.out.println(str2);
		
	}

}
