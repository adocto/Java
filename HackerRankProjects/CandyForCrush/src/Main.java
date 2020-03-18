import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.*;
        import java.lang.Math;


public class Main {
    public static int minTurn(int N, double[] candy) {
        double max;
        int turns = 0;
        double amount;
        double mod;
        boolean same = false;
        boolean flag = false;
        while (same == false) {
            flag = false;
            max = 0;
            same = true;
            for (int j = 0; j < N; j++) {
                if (max < candy[j]) {
                    max = candy[j];
                }
                if ((candy[0] == candy[j]) && (same == true)) {
                    same = true;
                } else {
                    same = false;
                }
            }
            if (same == false) {
                turns++;
                for (int k = 0; k < N; k++) {
                    if (flag == false) {
                        if (candy[k] == max) {
                            flag = true;
                            mod = candy[k] % 2;
                            amount = candy[k] / 2;
                            if (mod == 1) {
                                candy[k] = amount - 0.5;
                            } else {
                                candy[k] = amount;
                            }
                        } else {
                            flag = false;
                        }
                    } else {
                        if (candy[k] == max) {
                            mod = candy[k] % 2;
                            amount = candy[k] / 2;
                            if (mod == 1) {
                                candy[k] = amount - 0.5;
                            } else {
                                candy[k] = amount;
                            }
                        } else {
                            break;
                        }
                    }

                }


            } else {
                return (turns);
            }
        }
        return turns;
    }

        public static void main (String[]args) throws Exception {
            Scanner myKeyboard = new Scanner(System.in);
            int N = myKeyboard.nextInt();
            double[] candy = new double[N];
            int turns = 0;
            for (int i = 0; i < N; i++) {
                candy[i] = myKeyboard.nextDouble();
            }
            turns = minTurn(N, candy);

            System.out.println(turns);
        }


}