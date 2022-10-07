import java.util.Scanner;

public class usingswitch{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your age :");
            int age; 
            age= sc.nextInt();
            sc.close();
            switch (age){
                case 18:
                System.out.println("to be adult");
                break;
                case 25:
                System.out.println("in your twenties");
                break;
                case 42:
                System.out.println("semi-old");
                break;
                case 60:
                System.out.println("retirement");
                break;
                default:
                System.out.println("leave it bro :)");

            }
            }
}
