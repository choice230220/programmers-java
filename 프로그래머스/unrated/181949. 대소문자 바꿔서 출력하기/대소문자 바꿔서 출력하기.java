import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        for (char x : a.toCharArray()) {
			if (x >= 65 & x <= 90) {
				answer += (char)(x + 32);
			} else if (x >= 97 & x <= 122) {
				answer += (char)(x - 32);
			}
		}
        System.out.println(answer);
    }
}