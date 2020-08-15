import java.util.Arrays;

public class SecondMinMaxNumber {

    public static void main(String[] args) {
        int array1[] = { 1, 2, 5, 9, 6, 4, 7, 2 };

        Minimum(array1);
        Maximum(array1);
    }

    static void Minimum(int[] array1) {
        Arrays.sort(array1);
        int firstMinimum = array1[0];

        int secondMinimum = Integer.MAX_VALUE;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > firstMinimum && array1[i] < secondMinimum) {
                secondMinimum = array1[i];
            }
        }
        System.out.println("Second Minimum number is: " + secondMinimum);

    }

    static void Maximum(int[] array1) {
        Arrays.sort(array1);
        int firstMaximum = array1[array1.length - 1];
        int secondMaximum = Integer.MIN_VALUE;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < firstMaximum && secondMaximum < firstMaximum) {
                secondMaximum = array1[i];

            }
        }
        System.out.println("Secomd Max number is : " + secondMaximum);
    }

}
