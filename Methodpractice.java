import java.util.Scanner;
//already did this so skip

public class Methodpractice{
    //Table multiplication:
    static void table(int n){
        int i = 1;
        do {
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        } while (i < 11);
        // return i;
    }
    static void pattern(int n){
        for(int j=0;j<=n;j++){
            for(int k=0;k<=j;k++)
            System.out.print("* ");

            System.out.print("\n");
        }
    }

        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            System.out.println("enter n:");
            int n= s.nextInt();
            table(n);
            pattern(n);
            s.close();
}
}