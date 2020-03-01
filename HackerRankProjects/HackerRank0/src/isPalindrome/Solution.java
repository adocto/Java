package isPalindrome;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String isPalindrome = "Yes";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int left = 0;
        int right = A.length() - 1;
        while(left < right){
            if(A.charAt(left) == A.charAt(right)){
                isPalindrome = "Yes";
            }
            else {
                isPalindrome = "No";
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);



    }
}




