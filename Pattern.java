import java.util.Scanner;

public class Pattern{
        public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter n:");
        int n= s.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++)
            System.out.print("*  ");

            System.out.println("\n");
        }
s.close();
}
}