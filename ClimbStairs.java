import java.util.Scanner;

public class ClimbStairs {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int cp = countPath(n, new int[n + 1]);
            System.out.println(cp);
        }
    }

    public static int countPath(int n, int[] qb) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        if (qb[n] > 0) {
            return qb[n];
        }
        // System.out.println("hello" + n);
        int nm1 = countPath(n - 1, qb);
        int nm2 = countPath(n - 2, qb);
        // int nm3 = countPath(n - 3, qb);
        int cp = nm1 + nm2;

        qb[n] = cp;
        return cp;
    }
}