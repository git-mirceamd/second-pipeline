public class InterestCalc {

    static int principal = 500000;
    static double rate = 3.5;
    static int years = 15;

    public static void main(String[] args) {
        double interest = principal * rate/100 * years;
        System.out.println(interest);
    }

}
