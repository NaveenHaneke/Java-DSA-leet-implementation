package pattern_Ques;

public class pattern_4 {
	public static void main(String[] args) {

		int n = 5;
		int total_sp = n - 1;
		int total_st = 1;

		int row = 0;
		while (row < n) {
			int sp = 0;
			while (sp < total_sp) {
				System.out.print("  ");
				sp++;
			}
			int st = 1;
			while (st <= total_st) {
				System.out.print("* ");
				st++;
			}
			System.out.println();
			total_st++;
			total_sp--;
			row++;
		}

	}
}
