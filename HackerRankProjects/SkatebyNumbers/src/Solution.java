import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner myKeyboard = new Scanner(System.in);
        int N = myKeyboard.nextInt();
        int[] height = new int[N];
        int speed = 1;
        for(int i = 0; i < N; i++){
            height[i] = myKeyboard.nextInt();
        }
        for(int j = 1; j < N; j++){
            if(height[j] > height[j-1]){
                speed = speed - 1;
            }else{
                speed = speed+1;
            }
            System.out.println(speed);
        }
        System.out.println(speed);
    }
}