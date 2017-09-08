import java.util.Scanner;

/**
 * Created by liangnan on 2017/8/11.
 */
public class BuyApple {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		System.out.println(solution(n));

		scan.close();
	}

	private static int solution(int n){
		int minBagsNum = n;

		if(n % 2 == 1)
			return -1;

		for(int i = 0; i <= n/6; i++){
			if((n - 6*i) % 8 == 0) {
				int j = (n - 6 * i) / 8;
				minBagsNum = minBagsNum > (i + j) ? i + j : minBagsNum;
			}
		}

		return minBagsNum == n? -1: minBagsNum;
	}
}
