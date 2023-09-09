package ch03.home;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class PhysExamSearchV {

	static class PhyscData {
		private String name;
		private int    height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;  this.height = height;  this.vision = vision;
		}

		public String toString() {
			return name + " " + height + " " + vision;
		}

		public static final Comparator<PhyscData> VISION_ORDER =
															new VisionOrderComparator();

		private static class VisionOrderComparator
													 implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision > d2.vision) ?  1 :
							 (d1.vision < d2.vision) ? -1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {
			new PhyscData("강민하", 162, 0.3),
			new PhyscData("이수연", 168, 0.4),
			new PhyscData("김찬우", 173, 0.7),
			new PhyscData("황지안", 169, 0.8),
			new PhyscData("장경오", 174, 1.2),
			new PhyscData("유서범", 171, 1.5),
			new PhyscData("박준서", 175, 2.0),
		};
		System.out.print("검색할 시력은?  : ");
		double vision = stdIn.nextDouble();
		int idx = Arrays.binarySearch(
						x,
						new PhyscData("", 0, vision),
						PhyscData.VISION_ORDER
					 );

		if (idx < 0)
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		else {
			System.out.println("그 값은 " + "x[" + idx + "]에 있습니다.");
			System.out.println("데이터 : " + x[idx]);
		}
	}
}

