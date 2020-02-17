import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long lLim = (long) Math.pow(-2,63);
        long uLim = (long) Math.pow(2,63) -1;

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                switch (x) {
                    case((x >= lLim) && (x <= uLim)):
                    case((x >= -2147483648)&&(x <=  2147483647)):
                        System.out.println("* byte");
                        System.out.println("* short");
                        System.out.println("* int");
                        break;
                    case ((x >= -32768) && (x <= 32767 )):
                        System.out.println("* byte");
                        System.out.println("* short");
                        break;
                    case ((x >= -128) && (x <= 127)):
                        System.out.println("* byte");
                        break;
                }
                //Complete the code



            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



