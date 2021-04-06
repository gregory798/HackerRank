import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[][][] possiblepermuts = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},// 1

            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},// 2

            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},// 3

            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},// 4

            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},// 5

            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},// 6

            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},// 7

            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},// 8
        };

        int[][] t = new int[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
                t[i][j] = input.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int permut = 0; permut < 8; permut++) 
        {
            int permutCost = 0;
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++)
                    permutCost += Math.abs(t[i][j] - possiblepermuts[permut][i][j]);
            }
            min = Math.min(min, permutCost);
        }
        System.out.println(min);
    }
}
