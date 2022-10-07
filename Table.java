import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  t:");
        int t = s.nextInt();

        while (t > 0) {
            System.out.println("Enter  n:");
            int n = s.nextInt();
            // for(int i=1;i<11;i++)
            // System.out.println(n+" x "+ i +" = "+ n*i);

            // USING WHILE LOOP:
            // int i=1;
            // while(i<11){
            // System.out.println(n+" x "+ i +" = "+ n*i);
            // i++;
            // }
            int i = 1;
            do {
                System.out.println(n + " x " + i + " = " + n * i);
                i++;
            } while (i < 11);
        }
        s.close();
    }
}