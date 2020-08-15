import java.util.Arrays;

public class ArrayMinMax {

	static void MinMax(int[] array1) {
		Arrays.sort(array1);
		System.out.printf("Minimum : %d   Maximum : %d", array1[0], array1[array1.length - 1]);

	}

	public static void main(String[] args) {
		int array1[] = { 1, 2, 5, 5, 6, 6, 7, 2 };

		MinMax(array1);
	}

}
