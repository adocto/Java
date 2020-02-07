public class GreaterLessThan {
    public static void main(String[] args) {
        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        boolean isGreater = creditsEarned > creditsToGraduate;
        System.out.println(isGreater);
        double creditsAfterSeminar = creditsOfSeminar + creditsEarned;
        boolean newGreater = creditsAfterSeminar > creditsToGraduate;
        System.out.println(newGreater);
    }
}