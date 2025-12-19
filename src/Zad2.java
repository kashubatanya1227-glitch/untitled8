public class Zad2 {
    public static void main(String[] args) {
        int[] angles = {60, 60, 60};
        int sum = 0;

        for (int i = 0; i < angles.length; i++) {
            sum += angles[i];
        }

        int n = angles.length;

        if (sum == 180 * (n - 2))
            System.out.println("Многоугольник существует");
        else
            System.out.println("Многоугольник не существует");
    }
}