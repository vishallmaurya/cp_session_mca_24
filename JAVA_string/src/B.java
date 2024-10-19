import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\\')  
                break;
            ans.append(s.charAt(i));
        }
        
        System.out.println(ans.toString());  
    }
}
