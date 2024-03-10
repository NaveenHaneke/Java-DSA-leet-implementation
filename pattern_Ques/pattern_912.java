package pattern_Ques;

import java.util.Scanner;

public class pattern_912 {
	public static void main(String[] args) {
		

		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
		int total_sp = count;
		int row = 0;
		while(row < count) {
			int sp = 0;
			while(sp < total_sp) {
				System.out.print("   ");
				sp++;
			}
			int st = 0;
			while(st < row*2 + 1) {
				if(st%2 == 0 ) {
					System.out.print(" * ");
				}else {
					System.out.print(" ! ");
				}
				st++;	
			}
			System.out.println("   ");
			row++;
			total_sp --;
			
		}
	}

}
