
public class SortArray {

	public static void main(String[] args) {
		int arr[] = {10, 8, 54, 89, 23, 31, 0, 2, 17, 154, 2, 3, 1};
		int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println("Sorted Array");
        for (int num: arr) {
        	System.out.print(num + " ");
        }
	}

}
