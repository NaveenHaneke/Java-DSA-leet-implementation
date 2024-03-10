package pattern_Ques;

public class pattern_3 {

	public static void main(String[] args) {
		
		int n = 0;
		int i = 5;
		System.out.println();
		while (i >= n) {
			int j = 0;
			while (j < i) {
				System.out.print(" * ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
