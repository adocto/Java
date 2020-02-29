package areAnagrams;

import java.util.Hashtable;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Map <Character,Integer> tableA = new Hashtable<Object, Object>();
        Map <Character,Integer> tableB = new Hashtable<Object, Object>();

        if (tableA.equals(tableB)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
