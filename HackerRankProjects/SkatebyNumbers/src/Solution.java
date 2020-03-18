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
        for(int j = 0; j < N; j++){
            if(j > 0) {
                if ((height[j] > height[j - 1])) {
                    speed = speed - 1;
                } else if ((height[j] < height[j - 1])) {
                    speed = speed + 1;
                } else{
                    speed = speed;
                }
                if (speed > max) {
                    max = speed;
                }
            }else {
                speed = speed;
            }
        }
        System.out.println(max);
    }
}