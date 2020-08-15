import java.util.Arrays;

public class SumOfSmallestPair {

    public static void main(String[] args) {
        int array1[] = { 1, 7, 2, 9, 6 };
        Sum(array1);
    }

    static void Sum(int array1[]) {
        Arrays.sort(array1);

        int firstMinimum = array1[0];
        int secondMinimum = Integer.MAX_VALUE;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > firstMinimum && array1[i] < secondMinimum) {
                secondMinimum = array1[i];
            }
        }
        System.out.printf("sum of smallest pair (%d , %d) is %d", firstMinimum, secondMinimum, firstMinimum + secondMinimum);
    }
}