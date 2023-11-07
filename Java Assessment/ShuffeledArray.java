public class ShuffeledArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        customShuffleArray(arr);

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void customShuffleArray(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            int j = randomNum(i + 1);
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int randomNum(int num) {
        long currentTime = System.currentTimeMillis();
        return (int) (currentTime % num);

    }
}
