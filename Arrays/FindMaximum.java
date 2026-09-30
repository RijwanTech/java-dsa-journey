public class FindMaximum {

    public static int findMaximum(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 42, 18};

        System.out.println("Maximum: " + findMaximum(arr));
    }
}