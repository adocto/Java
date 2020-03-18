import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner myKeyboard = new Scanner(System.in);
        int N = myKeyboard.nextInt();
        int[] height = new int[N];
        int speed = 1;
        int max = 1;
        for(int i = 0; i < N; i++){
            height[i] = myKeyboard.nextInt();
        }
        for(int j = 1; j < N; j++){
            if((height[j] > height[j-1])){//&& speed > 0
                speed = speed - 1;
            }else if (height[j] < height[j-1]){
                speed = speed+1;
            }
            if(speed > max){
                max = speed;
            }

        }
        System.out.println(max);
    }
}