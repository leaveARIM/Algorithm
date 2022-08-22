import java.io.BufferedReader;
import java.io.InputStreamReader;

public class yejin_Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] inputNumList = br.readLine().toCharArray();
		int answer = Integer.valueOf(inputNumList[0]);
		
		for(int i = 1; i < inputNumList.length; i++) {
			int num = Integer.valueOf(inputNumList[i]);
			
			//if(num <= 1) {  answer가 0,1일 경우는 생각을 안했다..
			if(num <= 1 | answer <= 1) {
				answer += num;
			}else {
				answer *= num;
			}
		}
		
		System.out.println(answer);
	}

}
