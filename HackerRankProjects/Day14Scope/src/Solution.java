import java.util.*;


class Difference {

    private int[] elements;
    public int maximumDifference;
    // Add your code here
    private int l = 0;
    private int r = 0;
    private int absoluteDifference;
    private int[] a;
    public Difference(int[] a){
        this.elements = a;
        this.l = 0;
        this.r = 0;
        this.absoluteDifference = 0;
        this.maximumDifference = 0;
    }
    int computeDifference () {
        int arrSize = elements.length;
        for(int l = 0; l < arrSize; l++){
            for(int r = 0; r < arrSize; r++){
                absoluteDifference = Math.abs(elements[l] - elements[r]);
                if(absoluteDifference > maximumDifference){
                    maximumDifference = absoluteDifference;
                }
            }
        }
        return absoluteDifference;
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}