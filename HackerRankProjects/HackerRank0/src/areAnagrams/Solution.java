package areAnagrams;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int lenA =  a.length();
        int lenB = b.length();
        if(lenA != lenB){
            return false;
        }else{
            a = a.toLowerCase();
            b = b.toLowerCase();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < lenA; i++){
                char currentLetter = a.charAt(i);
                if(map.containsKey(currentLetter)){
                    Integer occurrence = map.get(currentLetter);
                    map.put(currentLetter,++occurrence);
                }else{
                    map.put(currentLetter,1);
                }
            }

            for(int j = 0; j < lenB; j++){
                char currentLetter = b.charAt(j);
                if(map.containsKey(currentLetter)){
                    Integer occurrence = map.get(currentLetter);
                    if(occurrence == 0){
                        return false;
                    }else{
                        map.put(currentLetter,--occurrence);
                    }
                }else{
                    return false;
                }
            }
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
