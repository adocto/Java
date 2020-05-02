import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            boolean valid = true;
            try {
                Pattern pattern1 = Pattern.compile(pattern);
            }
            catch(PatternSyntaxException e){
                valid = false;
            }
            if(valid == true){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            testCases--;

        }
    }
}



