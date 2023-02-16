import java.util.Scanner;

public class BinomaialCoefficient {
    public static long fact(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * fact(i - 1);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter n value:");

            int n = sc.nextInt();
            System.out.println("enter t value:");

            int t = sc.nextInt();
            long ncr = fact(n) / (fact(t) * fact(n - t));
            System.out.println("c(" + n + ", " + t + ") :" + ncr);
        }

    }

}
