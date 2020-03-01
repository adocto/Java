import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int num1 = 0;
        int exp1;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            num1 = a;
            for(double j = 0; j<n; j++){
                exp1 = (int) Math.pow(2,j);
                num1 = num1 + (exp1 * b);
                if(j  == 0){
                    System.out.print(num1);
                }else{
                    System.out.printf(" %d",num1);
                }
            }
            System.out.println();
            num1 = 0;
        }
        in.close();
    }
}

