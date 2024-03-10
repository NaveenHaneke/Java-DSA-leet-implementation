package pattern_Ques;

public class pattern_6 {
	public static void main(String[] args) {
		
		int n = 5;
		int total_st = n ;
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
			total_sp = total_sp + 2;
			row++;
		}
	}

}
