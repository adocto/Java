import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;
    private int l = 0;
    private int r = 0;
    private int absoluteDifference;

    // Add your code here
    Difference (int[] a) {
        maximumDifference = 0;
        absoluteDifference = 0;
        for(int l = 0; l < a.length; l++){
            for(int r = 0; r < a.length; r++){
                absoluteDifference = Math.abs(a[l] - a[r]);
                if(absoluteDifference > maximumDifference){
                    maximumDifference = absoluteDifference;
                }
            }
        }
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}