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
        //stack for storing binary members
        Stack<int> binStack = new Stack<int>();
        //The binary member to add to stack
        int result;


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        //Get the remainder and add it to member stock.
        while(n > 0){
            result = n%0;
            n = n/2;
            binStack.add(result);
        }

    }
}
