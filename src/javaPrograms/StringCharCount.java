package javaPrograms;

public class StringCharCount {

	public static void main(String[] args) {
		String str="circumtance";

		int count[] = new int[256];
		 
	        int len = str.length();
	 
	        // Initialize count array index
	        for (int i = 0; i < len; i++)
	        {  count[str.charAt(i)]++;
	        System.out.println(count[str.charAt(i)]);
	        }
	        
	        
	 
	        // Create an array of given String size
	        char ch[] = str.toCharArray();
	        for (int i = 0; i < len; i++) {
	            
	            int find = 0;
	            for (int j = 0; j <= i; j++) {
	 
	                // If any matches found
	                if (str.charAt(i) == ch[j]) 
	                    find++;                
	            }
	 
	            if (find == 1) 
	                System.out.println("Number of Occurrence of " +
	                 str.charAt(i) + " is:" + count[str.charAt(i)]);
	}

}
}