import java.util.Arrays;

public class MaximumDifference {
	static void MaximumDiff(int array1[])
	{
		Arrays.sort(array1);
		System.out.printf("The maximum difference between %d and %d is: %d",array1[array1.length-1],array1[0],array1[array1.length-1]-array1[0]);
	    System.out.println();
	}
	public static void main(String[] args) {
		int array1[] = { 2, 5, 1, 7, 3, 9, 5};
		int array2[] = { 9, 2, 12, 5, 4, 7, 3, 19, 5};
		
		MaximumDiff(array1);
		MaximumDiff(array2);
	}
}
