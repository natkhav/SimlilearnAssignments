package lis;

public class LISTest {
	public static void main(String[] args) {
		int[] arr1 = {1};
		System.out.println("Result 1: "+LIS.lis(arr1));
		
		int[] arr2 = {-1};
		System.out.println("Result 2: "+LIS.lis(arr2));
		
		int[] arr3 = {-1, 1};
		System.out.println("Result 3: "+LIS.lis(arr3));
		
		int[] arr4 = {1, -1};
		System.out.println("Result 4: "+LIS.lis(arr4));
		
		int[] arr5 = {28, 10, 20, 11, 10, 15, -1, 5};
		System.out.println("Result 5: "+LIS.lis(arr5));
		
		int[] arr6 = {-5, -4, -3, -2, -1, -10};
		System.out.println("Result 6: "+LIS.lis(arr6));
		
		int[] arr7 = {5, 7, -24, 12, 10, 2, 3, 12, 5, 6, 35};
		System.out.println("Result 7: "+LIS.lis(arr7));
	}

}
