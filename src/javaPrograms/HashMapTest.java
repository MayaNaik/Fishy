package javaPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, HashMap<String,String>> mp = new HashMap<String, HashMap<String,String>>();
		HashMap< String, String> nl = new LinkedHashMap<String, String>();
		nl.put("jjj", "dfd");
		nl.put("er", "sdfgd");
		mp.put("ts", nl);
		System.out.println(nl);
		System.out.println(mp);
		
		
	}
}
