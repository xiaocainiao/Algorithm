import java.util.Scanner;

/**
 * Created by liangnan on 2017/8/11.
 */
public class hwSeq {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();

			int[] arr = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = scan.nextInt();
			}
			System.out.print(solution(arr, n));
		}
		scan.close();
	}

	private static int solution(int[] arr, int len){
		int left = 0;
		int right = len - 1;
		int ret = 0;

		while(left < right){
			if(arr[left] < arr[right]){
				arr[left+1] += arr[left];
				left++;
				ret++;
			}else if (arr[left] > arr[right]){
				arr[right-1] += arr[right];
				right--;
				ret++;
			}else{
				left++;
				right--;
			}
		}
		return ret;
	}
}
