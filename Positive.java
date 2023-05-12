public class Positive {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j > 0) sum += j;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
    }
}
