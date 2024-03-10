package Assignment_1;

import java.util.Scanner;

public class countDigits {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        long sum = scn.nextLong();
        long find = scn.nextLong();
        long cnt = 0;
        
        for(int i = 0; i <= sum; i++){
            long n = sum % 10;
            
            sum = sum / 10;

            if(n == find){
                cnt++;
            }


        }
        System.out.println(cnt);
	}

}
