package test;

public class test {
	public static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sum(5) = 5 + 4 + 3 + 2 + 1 = 15
	
//		int total = 0;
//		int targetNum = 10000;
//		
//		// starting at 5, count down to 0, summing as we go
//		for (int i = targetNum; i > 0; i--) {
//			total = total + i;
//		}
		
		int[] arr = { 1, 2, 5, 6, 35, 45, 75 };
		
		System.out.println("Index for 76: " + binarySearch(arr, 0, arr.length - 1, 76));
		
		/*
		 * looping = linear search = O(n)
		 * 
		 * binary search = logarithmic = O(log n)
		 * */
		
		
		
//		int total = Sum(5);
//		
//		System.out.println("The total is: " + total);
		
	}
	
	public static int Sum(int input) {
		// base case
		if (input == 1) {
			return 1;
		}
		
		return input + Sum(input - 1);
	}

	public static int binarySearch(int[] arr, int left, int right, int target) {
		count++;
		System.out.println("Searching for " + target + ". Iteration: " + count);

		int mid = (left + right) / 2;
		
		// base case not found
		if (right < left) {
			return -1;
		}
		
		if (target < arr[mid]) {
			return binarySearch(arr, left, mid - 1, target);
		}
		
		if (target > arr[mid]) {
			return binarySearch(arr, mid + 1, right, target);
		}
		
		if (target == arr[mid]) {
			return mid;
		}
		
		return -1;
	}
	
}
