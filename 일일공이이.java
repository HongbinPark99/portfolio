import java.util.Scanner;

public class 일일공이이 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = A + B;

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + C);
        }

        in.close();
    }
}
