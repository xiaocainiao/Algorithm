import java.util.Scanner;

/**
 * Created by liangnan on 2017/8/11.
 */
public class rev {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		int result = solution(solution(x)+solution(y));
		System.out.println(result);

		scan.close();
	}

	private static int solution(int num){
		int ret = 0;

		while(num > 0){
			int r = num % 10;
			num /= 10;
			ret = ret*10+r;
		}

		return ret;
	}
}
