package convertToBinary;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //stack for storing binary elements
        Stack binStack = new Stack();
        //keep track of max consecutive 1's
        int max1 = 0;
        //keep track of current consecutive 1's
        int streak = 0;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        //binary element (starting from LSB) to enter stack
        int result;
        while(n>0){
            result = n%2;
            binStack.push(result);
            n = n/2;
        }

        while(binStack.empty() != true){
            

            if(streak > max1){
                max1 = streak;
            }
        }




    }
}
