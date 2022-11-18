import java.util.*;
public class Switch_calculator{
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            System.out.println("enter a and b:");
            int a= s.nextInt();
            int b= s.nextInt();
            System.out.println("Enter the operator:");
            String op = s.next();
            switch (op){
                case "+":
                System.out.println("addition is "+ (a+b));
                break;
                case "-":
                System.out.println("Difference is "+ (a-b));
                break;
                case "*":
                System.out.println("Product is "+ (a*b));
                break;
                case "/":
                System.out.println("Division is "+ (a/b));
                break;
                default:
                System.out.println("Enter a valid operator!");

            }
            s.close();
        }
    }