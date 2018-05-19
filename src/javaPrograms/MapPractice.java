package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		String str="sandeep";
		HashMap<Character,Integer>mapString=new HashMap<Character,Integer>();
		char[] strArray = str.toCharArray();
		 
        //checking each char of strArray
 
        for (char c : strArray)
        {
            if(mapString.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
 
            	mapString.put(c, mapString.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
 
            	mapString.put(c, 1);
            }
        }
		System.out.println(mapString);
		 Set<Character> charsInString = mapString.keySet();
		 System.out.println(charsInString);
			 for (Map.Entry<Character,Integer> entry : mapString.entrySet()) 
			 {
		            System.out.println("Key = " + entry.getKey() +
		                             ", Value = " + entry.getValue());
			 }
	}

}
