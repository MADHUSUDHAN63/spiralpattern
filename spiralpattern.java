package program;

import java.util.*;

public class spiralpattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any Number for Spiral Pattern:");
		int n = s.nextInt();
		boolean eve;
		if (n % 2 == 0) {
			eve = true;
		} else {
			eve = false;
		}
		int val = 0;
		int mid = n / 2;
		int c1 = ((n - 1) * 4);
		for (int i = 1; i <= n; i++) {
			int inc = ((mid * 8) + 1);
			int dec = ((mid * 8) - 3);
			for (int j = 1; j <= n; j++) {

				if (i <= j && (i + j) <= n + 1) {
					val++;
					System.out.print(" " + val + " ");
				} else if (i >= i && (i + j) <= n + 1) {
					if (j == 1) {
						val = c1 - (i - 2);
						System.out.print(" " + val + " ");
					} else if (eve) {
						dec -= 8;
						val += dec;
						System.out.print(" " + val + " ");
					} else {
						inc -= 8;
						val += inc;

						System.out.print(" " + val + " ");
					}

				}

				else if ((i + j) > (n + 1) && i < j) {
					if (eve) {

						val -= 1 + ((j - (mid + 1)) * 8);

						System.out.print(" " + val + " ");
					} else {
						val -= 5 + ((j - (mid + 2)) * 8);

						System.out.print(" " + val + " ");
					}

				} else if ((i + j) > n + 1 && (i - j) >= 0) {
					val--;
					System.out.print(" " + val + " ");
				}
			}
			System.out.println();
		}

	}
}