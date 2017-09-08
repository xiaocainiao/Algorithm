import java.util.Scanner;

/**
 * Created by liangnan on 2017/8/11.
 */
public class OddDivisor {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		long result = solution2(N);
		System.out.println(result);

		scan.close();
	}

	private static int solution(int N){
		int ret = 0;

		for(int n = 1; n <= N; n++) {
			for (int i = n; i > 0; i--) {
				if (n % i == 0 && i % 2 == 1) {
					//System.out.println(n+" , "+i);
					ret += i;
					break;
				}
			}
		}


		return ret;
	}

	private static long solution2(long N){
		if(N == 1)
			return 1;
		//如果N是偶数，f(N) = f(N/2),还需加上N以内奇数的最大奇数约数之和，即他们本身之和
		if(N % 2 == 0){
			return solution2(N/2) + N*N/4;
		}else{
		//如果N是奇数，f(N) = f(N-1) + N
			return solution2(N - 1) + N;
		}

	}
}
