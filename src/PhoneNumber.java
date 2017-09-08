import java.util.*;
/**
 * Created by liangnan on 2017/9/1.
 */
public class PhoneNumber {
	public static void main(String[] args){
		List<String> ret = letterCombinations("1234");
		System.out.println(ret.toString());
	}

	private static List<String> letterCombinations(String digits) {
		String[] letters = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		LinkedList<String> ret = new LinkedList<>();
		if(digits.length() == 0)
			return ret;
		ret.add(letters[0]);

		for(int i = 0; i < digits.length(); i++){
			String tmp = letters[digits.charAt(i) - '0'];
			while(ret.peek().length()==i){
				String pre = ret.poll();

				for(char c : tmp.toCharArray()){
					String now = pre + c;
					ret.add(now);
				}
			}
		}
		return ret;
	}
}
