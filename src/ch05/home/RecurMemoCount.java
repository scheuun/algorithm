package ch05.home;

import java.util.Scanner;

class RecurMemoCount {

	static String[] memo;
	static int count;

	static void recur(int n) {
		count++;
		if (memo[n + 1] != null)
			System.out.print(memo[n + 1]);
		else {
			if (n > 0) {
				recur(n - 1);
				System.out.println(n);
				recur(n - 2);
				memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
			} else {
				memo[n + 1] = "";
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int x = stdIn.nextInt();

		memo = new String[x + 2];
		recur(x);

		System.out.println("메서드를 호출한 회수 : " + count);		
	}
}
