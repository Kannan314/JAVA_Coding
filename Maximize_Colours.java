//For the human eye, primary colours are red, green, and blue.
//Combining 1 drop of each of any two primary colours produces a new type of secondary
//colour. For example, mixing red and green gives yellow, mixing green and blue gives cyan,
//and mixing red and blue gives magenta.
//You have X, Y, and Z drops of red, green, and blue colours respectively. Find the maximum
//total number of distinct colours (both primary and secondary) you can have at any particular moment.
//Note: You cannot mix a secondary colour with a primary or another secondary color to get a new type of colour.
//Input Format
//  The first line of input will contain a single integer T, denoting the number of test cases.
//  Each test case consists of three space-separated integers X, Y, and Z, the number of drops of red, green, and blue colors respectively.
//Output Format
//  For each test case, output on a new line the maximum total number of colors (both primary and secondary) you can have using the given primary colors.

package Project;
import java.util.Scanner;
public class Demo {
	public static int colors(int red, int green, int blue) {
		int primary = 0;
		int secondary = 0;
		if(red > 0) {
			primary++;
			red--;
		}
		if(green > 0) {
			primary++;
			green--;
		}
		if(blue > 0) {
			primary++;
			blue--;
		}
		if(red > 0 && green > 0)  {
			secondary++;
			red--;
			green--;
		}
		if(red > 0 && blue > 0) {
			secondary++;
			red--;
			blue--;
		}
		if(blue > 0 && green > 0) {
			secondary++;
			blue--;
			green--;
		}
		return primary + secondary;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int res[] = new int[size];
		for(int i = 0;i < size;i++) {
			int red = sc.nextInt();
			int green = sc.nextInt();
			int blue = sc.nextInt();
			res[i] =  colors(red, green, blue);
		}
		for(int ans : res)
			System.out.println(ans);	
	}
}
