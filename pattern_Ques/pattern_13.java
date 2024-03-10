package pattern_Ques;

import java.util.Scanner;

public class pattern_13 {

	public static void main(String[] args) {
		

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
		
		
		int row = 0;
		while(row < count*2 ) {
			
			int st = 0;
			int cnt = 0;
			if(cnt <= count) {
				int total_st = row;
				while(st < total_st) {
					System.out.print(" * ");	
					st++;
					
				}
				cnt++;
			}else {
				int total_st = row - count;
				while(st < total_st) {
					System.out.print(" *5 ");	
					st++;
					total_st--;
					cnt++;
				}
			}
			
			System.out.println();
			row++;
		}
	}

}
