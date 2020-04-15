import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String s1 = s.trim();
        String[] arrs = s1.split("\\P{L}+");
        if(s1.length() > 0) {
            System.out.println(arrs.length);
        }else{
            System.out.println(0);
        }
        String a;
        for (int i = 0; i < arrs.length; i++) {
            a = arrs[i];
            System.out.println(a);
        }

        scan.close();
    }
}

