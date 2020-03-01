package Anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        // Complete the function
        Integer[] countStore  = new Integer[26];

        for(int i = 0; i < a.length(); i++){
            int current = (int) Character.toUpperCase(a.charAt(i));

            if(countStore[current - 65] == null){
                countStore[current-65] = 1;
            }else{
                countStore[current-65] = countStore[current-65] + 1;
            }
        }

        for(int j = 0; j < b.length(); j++){
            int current = (int) Character.toUpperCase(b.charAt(j));
            if(countStore[current-65]== null){
                return false;
            }else if(countStore[current-65] == 0){
                return false;
            }else{
                countStore[current-65] = countStore[current-65] - 1;
            }

        }
        return true;
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
