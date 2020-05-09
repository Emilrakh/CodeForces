import java.util.Scanner;

public class SummPar {

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

        int t = 0;
        int c = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            int b[] = new int[a[i][2]];
            while (t < a[i][2]){
                if (a[i][1] % c != 0) {
                    b[x] = c;
                    c++;
                } else {
                    t++;
                }
            }
            System.out.println(b[a[i][2] - 1]);
            t = 0;
            c = 0;
            x = 0;
        }
    }
}
