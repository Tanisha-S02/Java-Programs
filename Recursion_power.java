import java.util.Scanner;

public class Recursion_power{
    static int power(int n,int p){
        if(p==0)
        return 1;

        return n* power(n,p-1);
    }
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            System.out.println("enter n and power p:");
            int n= s.nextInt();
            int p= s.nextInt();
            System.out.println(power(n, p));

            s.close();
}
}