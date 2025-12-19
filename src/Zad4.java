public class Zad4 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i <= 90; i++) {
            System.out.printf("%.3f ", Math.sin(Math.toRadians(i)));
            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}