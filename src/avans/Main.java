package avans;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test my methods:\n");

        double a = 33.3;
        double b = 66.6;
        double r = sum(a, b);
        double s = square(a);
        System.out.println(a + " + " + b + " = " + r);
        System.out.println(a + " ^2 = " + s);
    }

    public static double sum ( double a, double b ) {
        return a + b;
    }
    
    public static double square(double a) {
        return Math.pow(a, 2);
    }
}
