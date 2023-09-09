package ch05.home;

import java.util.Scanner;

class HanoiEx {

	static String[] name = {"A 기둥", "B 기둥", "C 기둥"};

	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);

		System.out.println("원반[" + no + "]을 " + name[x - 1] + "에서 " + name[y - 1] + "으로 이동");

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("하노이의 탑");
		System.out.print("원반의 개수 : ");
		int n = stdIn.nextInt();

		move(n, 1, 3);
	}
}

