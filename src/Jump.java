import java.util.Scanner;

/**
 * Created by liangnan on 2017/8/11.
 */
public class Jump {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();

		System.out.println(solution(N, M));
		scan.close();
	}

	private static int solution(int n, int m){
		int ret = 0;
		int k = n;

		while(k < m) {
			for (int i = k - 1; i >= (int)Math.sqrt(k); i--) {
				if (k % i == 0) {
					k += i;
					System.out.println(k+" , "+i);
					break;
				}
			}
			ret++;
		}

		return ret;
	}
}
