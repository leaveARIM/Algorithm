import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	static int N, M;
	static int ans;
	static int[] w;
	static BufferedReader br;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		w = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			w[i] = Integer.parseInt(st.nextToken());
		}

		//완탐으로 풀기 O(N^2)
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				if (w[i] != w[j])
					ans++;
			}
		}
		
		System.out.println(ans);
	}
}
