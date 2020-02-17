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
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int M;
        for(int i = 1; 0 <= i && i <= 10; i++){
            M = N * i;
            System.out.printf("%d x %d = %d", N, i, M);
            System.out.println();


        }

    }
}
