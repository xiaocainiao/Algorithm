import java.util.Scanner;

/**
 * Created by liangnan on 2017/8/11.
 */
public class Candy {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[4];
		for(int i = 0; i < 4; i++)
			arr[i] = scan.nextInt();
		System.out.println(solution(arr));
		scan.close();
	}

	private static String solution(int[] arr){
		if(arr == null)
			return "No";
		int A = (arr[0] + arr[2])/2;
		int B = (arr[1] + arr[3])/2;
		int C = (arr[3] - arr[1])/2;
		if ((arr[0] == A - B) && (arr[1] == B - C) && (arr[2] == A + B) && (arr[3] == B + C))
			return A+" "+B+" "+C;
		else
			return "No";
	}
}
