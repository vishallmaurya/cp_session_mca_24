import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        int flag1 = 0, flag2 = 0;
        int n = Math.min(x.length(), y.length());

        for (int i = 0; i < n; i++) {
            if (x.charAt(i) > y.charAt(i)) {
                flag2 = 1;
                break;
            } else if (x.charAt(i) < y.charAt(i)) {
                flag1 = 1;
                break;
            }
        }

        if (flag1 == 1) {
            System.out.println(x);
        } else if (flag2 == 1) {
            System.out.println(y);
        } else {
            if (x.length() < y.length()) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }
 
    }
}