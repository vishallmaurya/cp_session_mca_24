import java.util.Scanner;
 
public class D {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ans1 = a + "" + b;
        String ans2 = b.charAt(0) + "" + a.substring(1) + " " + a.charAt(0) + "" + b.substring(1);
        System.out.println(a.length() + " " + b.length());
        System.out.println(ans1);
        System.out.println(ans2);
    }
}