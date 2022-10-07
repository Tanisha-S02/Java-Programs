import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  t:");
        int t = s.nextInt();

        while (t > 0) {
            int fact=1;
            System.out.println("Enter  n:");
            int n = s.nextInt();
            for(int i=1;i<=n;i++)
            fact*=i;
            System.out.println(fact);
        }
        s.close();
}
}