// import java.util.Scanner;

public class Overloading{
    static void sum(int a,int b){
        int c= a+b;
        System.out.println(c);
    }

    static void sum(int a,int b,int c){
        int d= a+b+c;
        System.out.println(d);
    }
        public static void main(String[] args){
            // Scanner sc = new Scanner(System.in);
            sum(5,10);
            sum(5,10,15);
}
}