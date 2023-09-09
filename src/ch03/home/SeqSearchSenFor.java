package ch03.home;

import java.util.Scanner;

class SeqSearchSenFor {

	static int seqSearchSen(int[] a, int n, int key) {
		int i;

		a[n] = key;

		for (i = 0 ; a[i] != key; i++)
			;
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		System.out.print("검색 값 : ");
		int ky = stdIn.nextInt();

		int idx = seqSearchSen(x, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}
}
