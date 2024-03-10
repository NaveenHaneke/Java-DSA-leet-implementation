package pattern_Ques;

public class pattern_8 {
	public static void main(String[] args) {
		
		int count = 5;
		
		for(int row = 0; row < count; row++) {
			for(int st=0; st < count; st++) {
				if(st == row || st == count - row - 1) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
		
	}

}
