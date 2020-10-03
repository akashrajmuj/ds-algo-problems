import java.util.Arrays;
public class TargetSum {

	// This algorithm is based on two pointers to get
	// the given target sum
	// NB: Expects a sorted input array to get the right answer
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[10],target;
		System.out.println("Enter Ten elements in array");
		for(int i=0;i<10;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter target element");
		target=sc.nextInt();
		System.out.println(Arrays.toString(targetSum(arr, target)));
	}

	// targetSum returns the index of the pair for the
	// elements that add up to the target
	public static int[] targetSum(int[] arr, int target) {
		int start = 0, end = arr.length - 1;
		while (sum!=target && start < end) {       //improved while loop condition
			int sum = (arr[start] + arr[end]);
			if (sum < target) {
				++start;
			}
			else {
				--end;
			}
		}
		if(sum==target)
			return new int[] { arr[start], arr[end] };
		else
		return new int[] {};		
	}
}
