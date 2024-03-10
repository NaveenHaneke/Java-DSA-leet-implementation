package pattern_Ques;

import java.util.Scanner;

public class pattern_5 {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
		int n = 5;
		int total_st = n - 1;
		int total_sp = 0;

		int row = 0;
		while (row < n) {
			int sp = 0;
			while (sp < total_sp) {
				System.out.print("   ");
				sp++;
			}
			int st = 1;
			while (st <= total_st) {
				System.out.print(" * ");
				st++;
			}
			System.out.println();
			total_st--;
			total_sp++;
			row++;
		}

	}

}
