import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by liangnan on 2017/8/23.
 */
public class Permutation {
	private static List<String> perms = new ArrayList<>();

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			perms = new ArrayList<>();
			String s = scan.next();
			char[] arr = s.toCharArray();
			if(isLegal(arr))
				permutation(arr, 0);

			Collections.sort(perms);
			for(String perm : perms)
				System.out.println(perm);
			System.out.println();
		}
	}

	private static void permutation(char[] arr, int start){
		if(start == arr.length){
			perms.add(String.valueOf(arr));
			return ;
		}

		for(int i = start; i < arr.length; i++){
			swap(arr, start, i);
			permutation(arr, start+1);
			swap(arr, start, i);
		}

	}

	private static void swap(char[] arr, int i, int j){
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	private static boolean isLegal(char[] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] >= 'a' && arr[i] <= 'z')
				return true;
		}
		return false;
	}
}