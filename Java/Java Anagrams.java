import java.util.Scanner;

public class Solution {


    static boolean isAnagram(String a, String b) {
        int n = 256; 
        String aa = a.toLowerCase();
        String bb = b.toLowerCase();

        char[] str1 = aa.toCharArray();
        char[] str2 = bb.toCharArray();

        int count1[] = new int[n];  
        int count2[] = new int[n];
        for(int i = 0; i < n; i++){
            count1[i] = 0;
            count2[i] = 0;
        } 

        for (int i = 0; i < str1.length && i < str2.length; i++) { 
            count1[str1[i]]++; 
            count2[str2[i]]++; 
        } 

        if (str1.length != str2.length) 
            return false; 

        for (int i = 0; i < n; i++) 
            if (count1[i] != count2[i]) 
                return false; 
        return true; 
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
