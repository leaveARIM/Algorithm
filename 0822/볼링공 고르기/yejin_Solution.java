import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class yejin_Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0; //최종답
		int subSum = 0; //현재까지 확인한 볼링공의 개수
		int[] currMC = new int[2];  //현재 개수확인하고 있는 볼링공의 무게, 개수
		
		// N,M 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		//볼링공 리스트 입력받기 -> mList
		st = new StringTokenizer(br.readLine());
		
		int[] mList = new int[N+1];
		mList[0] = M+1;
		
		for (int i = 1; i <= N; i++) {
			mList[i] = Integer.parseInt(st.nextToken());	
		}
		
		
		// mList 정렬 ==> 오름차순으로 정렬되니 같은 값이 몇개있는지 확인하기 쉽다
		Arrays.sort(mList);
		
		for (int i = 0; i <= N; i++) {
			if(currMC[0] != mList[i]) { //새로운 무게의 시작
				//현재까지 체크한 개수 * 현재까지 subsum 를 answer에 더해주기
				answer += currMC[1] * subSum;
				//체크끝난 무게는 subSum에 더해주기
				subSum += currMC[1];
				
				//새로운 무게 세팅, 개수 1로 세팅
				currMC[0] = mList[i];
				currMC[1] = 1;
			}else { //동일 무게라면 무게개수 업데이트
				currMC[1]++;
			}
		}
		
		System.out.println(answer);
	}

}
