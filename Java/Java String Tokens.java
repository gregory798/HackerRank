import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
       if (s.trim().isEmpty()) {
            System.out.println(0);
        }
        else{
        String[] spl = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
        System.out.println(spl.length);
        for (String string : spl) {
            System.out.println(string);
        }
        scan.close();
    }
}
}
