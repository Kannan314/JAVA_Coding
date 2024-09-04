// Input:
// 5
// 5
// apple
// 15
// schtschurowskia
// 6
// polish
// 5
// tryst
// 3
// cry

// output
// YES
// NO
// YES
// NO
// YES



import java.util.*;
import java.lang.*;
import java.io.*;

class vowels_Question
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	  	Scanner scanner = new Scanner(System.in);
	    int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt(); 
            String S = scanner.next();
            String vowels = "aeiou";
            int consonantStreak = 0;
            boolean isEasy = true;
            for (int i = 0; i < S.length(); i++) {
                char currentChar = S.charAt(i);
                if (vowels.indexOf(currentChar) != -1) {
                    consonantStreak = 0;
                } else {
                    consonantStreak++;
                }
                if (consonantStreak >= 4) {
                    isEasy = false;
                    break;
                }
            }
            if (isEasy) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
	}
}
