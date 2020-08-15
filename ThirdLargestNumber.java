import java.util.Arrays;

public class ThirdLargestNumber {
	static void findThirdLargestNum(int numbers[]) {

		if (numbers.length < 3) {
			System.out.println("Size less Than 3");
			return;
		}
		int firstNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > firstNumber) {
				firstNumber = numbers[i];
			}
		}

		int secondNumber = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < firstNumber && numbers[i] > secondNumber) {
				secondNumber = numbers[i];
			}
		}
		int thirdNumber = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < secondNumber && numbers[i] > thirdNumber) {
				thirdNumber = numbers[i];
			}
		}
		System.out.println("Third Largest no is : " + thirdNumber);
	}

	public static void main(String[] args) {
		int array1[] = { 6, 8, 1, 9, 2, 1, 10 };
		int array2[] = { 6, 8, 1, 9, 2, 1, 10, 12 };
		int array3[] = { 6 };
		findThirdLargestNum(array1);
		findThirdLargestNum(array2);
		findThirdLargestNum(array3);

	}

}
