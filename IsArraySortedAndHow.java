// this is a Function which traverses an int array to determine
// whether it's sorted in ascending order, descending order, or neither

public class IsArraySortedAndHow {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 7, 8, 9 };
		int[] nums2 = { 9, 8, 7, 6, 5, 4, 1 };
		int[] nums3 = { 2, 1, 7, 9, 3, 9, 11 };

		System.out.println(isSortedAndHow(nums));
		System.out.println(isSortedAndHow(nums2));
		System.out.println(isSortedAndHow(nums3));
	}

	public static String isSortedAndHow(int[] array) {

// Ensure to use array.length-1 because if array.length is used instead,
// Addition will be conducted OUTSIDE the length of array, resulting in error

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1])
				return "This is sorted in ascending order.";
			if (array[i] < array[i + 1] && array[i + 1] > array[i + 2]
					|| array[i] > array[i + 1] && array[i + 1] < array[i + 2])
				return "Neither ascending or descending";
			else
				return "This is sorted in descending order.";
		}
		return "";
	}
}
