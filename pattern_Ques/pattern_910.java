package pattern_Ques;

import java.util.Scanner;

public class pattern_910 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
	
		int row = 0;
		while(row < count) {
			int total_sp = row;
			int total_st = (count-row)*2 - 1;
			int sp = 0;
			
			while(sp < total_sp) {
				System.out.print("   ");
				sp++;
			}
			
			int st = 0;
			while(st < total_st) {
				System.out.print(" * ");
				st++;
			}
			System.out.println();
			row++;
			total_sp++;
			total_st--;
		}
		
		
	}

}
