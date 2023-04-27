import java.util.Scanner;

public class HyperskillTestZookeeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int max = 0;
        int counter = 0;
        while (counter < total) {
            int current = scanner.nextInt();
            if (current % 4 == 0 && current > max) max = current;
            counter++;
        }
        System.out.println(max);
    }
}
