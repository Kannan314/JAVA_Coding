import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String[] h = {"", "One hundred", "Two hundred", "Three hundred", "Four hundred", "Five hundred", "Six hundred", "Seven hundred", "Eight hundred", "Nine hundred"};
        String[] t1 = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] t2 = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] o = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (a == 0) {
            System.out.println(o[0]);
            return;
        }
        if (a / 100 > 0) {
            System.out.print(h[a / 100] + " ");
        }
        a %= 100;
        if (a >= 10 && a < 20) {
            System.out.print(t1[a - 10]);
        else if (a >= 20) {
            System.out.print(t2[a / 10 - 2] + " ");
            a %= 10;
        }
        if (a > 0) {
            System.out.print(o[a]);
        }
        System.out.println();
    }
}
