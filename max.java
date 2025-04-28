public class MaxElementFinder {

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

   
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};
        int max = findMax(numbers);
        System.out.println("Maximum element: " + max);
    }
}
