import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	static int ans, a;
	static BufferedReader br;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		ans = s.charAt(0) - '0';

		for (int i = 1; i < s.length(); i++) {
			a = s.charAt(i) - '0';

			//0 or 1은 무조건 더해야 큰값 나옴
			if (a <= 1 || ans <= 1) {
				ans += a;
			} else {
				ans *= a;
			}
		}

		System.out.println(ans);
	}
}
