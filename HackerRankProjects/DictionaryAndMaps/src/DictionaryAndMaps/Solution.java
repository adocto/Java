package DictionaryAndMaps;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Hashtable<String,Integer> phoneBook = new Hashtable<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.containsKey(s)){
                int num = phoneBook.get(s);
                System.out.println(s+"="+num);
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
