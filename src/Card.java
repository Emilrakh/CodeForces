import java.util.Scanner;

public class Card {

    //не обработано исключение с 15

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        in.close();

        int cardH = 2;
        int newH = 5;
        int t = 0;

        for (int i = 0; i < n; i++) {
                while ((a[i] - cardH) >= 0) {
                    cardH += newH;
                    newH += 3;
                    t++;
                }
            System.out.println(t);
            t = 0;
            cardH = 2;
            newH = 5;
        }
    }
}

