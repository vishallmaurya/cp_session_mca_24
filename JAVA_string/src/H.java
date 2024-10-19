import java.util.*;

public
class H
{
public
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < t; j++)
        {
            String x = sc.nextLine();
            boolean flag = false;

            for (int i = 1; i < x.length() - 1; i++)
            {
                if ((x.charAt(i - 1) == '0' && x.charAt(i) == '1' && x.charAt(i + 1) == '0') || (x.charAt(i - 1) == '1' && x.charAt(i) == '0' && x.charAt(i + 1) == '1'))
                {
                    flag = true;
                    break;
                }
            }

            if (flag)
            {
                System.out.println("Good");
            }
            else
            {
                System.out.println("Bad");
            }
        }
    }
}