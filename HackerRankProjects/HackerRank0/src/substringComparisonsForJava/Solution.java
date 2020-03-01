import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int length = s.length();
        int left = 0;
        int right = k;
        String currentString = s.substring(left,right);
        smallest = currentString;
        largest = currentString;

        while(right <= length){
            currentString = s.substring(left,right);
            if(currentString.compareTo(smallest) < 0){
                smallest = currentString;
            }else{

            }
            if(currentString.compareTo(largest) > 0){
                largest = currentString;
            }else{

            }
            left++;
            right++;

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