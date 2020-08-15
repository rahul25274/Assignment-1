public class PairWithSum {

	public static void main(String[] args) {
		int array1[] = { 3, 6, 8, -8, 10, 8 };
		int sum = 16;
		findSumPairs(sum, array1);
	}

	static void findSumPairs(int sum, int array1[]) {
		System.out.printf("Pairs with sum %d are:", sum);
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if ((array1[i] + array1[j]) == sum) {
					System.out.printf("(%d , %d)", array1[i], array1[j]);
				}
			}
		}
	}
}
