import java.util.Random;

public class Zad1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random r = new Random();
        int even = 0, odd = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            System.out.print(a[i] + " ");

            if (a[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("\nПарных: " + even);
        System.out.println("Непарных: " + odd);
    }
}