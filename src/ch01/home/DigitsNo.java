package ch01.home;

import java.util.Scanner;

class DigitsNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("양의 정숫값의 자릿수를 구합니다.");

		int n;
		do {
			System.out.print("정숫값 : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0;
		while (n > 0) {
			n /= 10;
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");
	}
}
