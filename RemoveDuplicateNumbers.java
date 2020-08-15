
public class RemoveDuplicateNumbers {

	static int RemoveDuplicate(int array1[]) {
		int temp[] = new int[array1.length];
		int j = 0;
		for (int i = 0; i < array1.length - 1; i++) {
			if (array1[i] != array1[i + 1]) {
				temp[j++] = array1[i];
			}
		}
		for (int i = 0; i < j; i++) {
			array1[i] = temp[i];
		}

		return j;

	}

	public static void main(String[] args) {
		int array1[] = { 1, 2, 5, 5, 6, 6, 7, 2 };

		int length = RemoveDuplicate(array1);

		for (int i = 0; i < length; i++) {
			System.out.println(array1[i]);
		}
	}
}
