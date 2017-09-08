import java.util.Scanner;

/**
 * Created by liangnan on 2017/8/11.
 */
public class elegantDot {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();
		System.out.println(solution(r));

		scan.close();
	}

	private static int solution(int r){
		int ret = 0;

		for(int x = 1; ; x++){
			int x2 = x*x;
			if(x2 > r)
				break;
			int y = (int) Math.sqrt(r - x2);
			if(x2 + y*y == r)
				ret++;

		}
		return ret*4;
	}

}
