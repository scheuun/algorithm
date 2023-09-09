package ch02.home;

import java.util.Scanner;

class Rcopy {

	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[b.length - i - 1];
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a의 요솟수는  : ");
		int numa = stdIn.nextInt();
		int[] a = new int[numa];
		for (int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("b의 요솟수는  : ");
		int numb = stdIn.nextInt();
		int[] b = new int[numb];
		for (int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}

		rcopy(a, b);

		System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 copy 하였습니다.");
		for (int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
