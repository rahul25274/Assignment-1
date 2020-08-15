import java.util.Arrays;

public class SumOfUniqueElements {

	public static int findSum(int num[]) {

		Arrays.sort(num);
		int sum = num[0];

		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] != num[i + 1]) {
				sum += num[i + 1];

			}

		}
		return sum;
	}

	public static void main(String[] args) {
		int array1[] = { 1, 6, 4, 3, 2, 2, 3, 8, 1 };
		int array2[] = { 1, 1, 3, 2, 2, 3 };

		System.out.println(findSum(array1));
		System.out.println(findSum(array2));

	}

}
