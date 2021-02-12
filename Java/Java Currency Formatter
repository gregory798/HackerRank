import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        NumberFormat x1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = x1.format(payment);
        NumberFormat x2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = x2.format(payment);
        NumberFormat x3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = x3.format(payment);
        NumberFormat x4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = x4.format(payment);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
