import java.util.Scanner;

public class SummValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        in.close();

        for (int i = 0; i < n; i++) {

            int d;
            int r;
            int b[] = new int[5];
            int j = 0;

            r = a[i] % 10000;
            d = a[i] / 10000;
            a[i] = r;

            if (d != 0) {
                b[j] = d * 10000;
                j++;
            }

            r = a[i] % 1000;
            d = a[i] / 1000;
            a[i] = r;

            if (d != 0) {
                b[j] = d * 1000;
                j++;
            }

            r = a[i] % 100;
            d = a[i] / 100;
            a[i] = r;

            if (d != 0) {
                b[j] = d * 100;
                j++;
            }

            r = a[i] % 10;
            d = a[i] / 10;
            a[i] = r;

            if (d != 0) {
                b[j] = d * 10;
                j++;
            }

            if (a[i] != 0){
                b[j] = a[i];
                j++;
            }

            System.out.println(j);
            for (int c = 0; c < j; c++) {
                System.out.print(b[c] + " ");
            }
            System.out.println();
        }
    }
}
