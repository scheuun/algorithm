package ch05.home;

import java.util.Scanner;

class Recur2 {

	static void recur(int n) {
		if (n > 0) {
			recur(n - 2);
			System.out.println(n);
			recur(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int x = stdIn.nextInt();

		recur(x);
	}
}
