import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int length = s.length();
        int left =0;
        int right = k-1;
        String currentString = s.substring(left,right);
        int i;
        smallest = currentString;
        largest = currentString;

        for(i = 0, i < length, i++){
            currentString = s.substring(left,right);
            
        }




        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();


        System.out.println(getSmallestAndLargest(s, k));
    }
}