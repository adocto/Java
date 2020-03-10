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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int binMem;

        while(n>0){
            binMem = n%2;
            binStack.add(binMem);
            n = n/2;
        }
        int currentMax = 0;
        int max1 = 0;

        while(binStack.size() > 0){
            if(binStack.pop() == 1){
                currentMax++;
                if(currentMax > max1) {
                    max1 = currentMax;
                }
            }else{
                currentMax = 0;
            }
        }


    }
}
