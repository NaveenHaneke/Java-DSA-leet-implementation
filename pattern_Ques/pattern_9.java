package pattern_Ques;

import java.util.Scanner;

public class pattern_9 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		int row = 0;
		int total_sp = count;
		
		while(row < count) {

			int total_st = 2*row+1;
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
			total_sp--;
			total_st++;
			row++;
		}
		
	}

}
