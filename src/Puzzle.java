import java.util.Scanner;

public class Puzzle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j =0; j < 2; j++) {
                a[i][j] = in.nextInt();
            }
        }
        in.close();

        int p = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                if (a[i][j] == 1 || a[i][j+1] == 1 || (a[i][j+1] == 2 && a[i][j] == 2))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

        }
    }
}
