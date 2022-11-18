import java.util.*;
public class Control_statements{
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            //if
          /* 
            System.out.println("Enter your age:");
            int age= s.nextInt();
            if(age>=18)
            System.out.println("You are eligible to vote");
            */  
            
            //if-else
            /* int age= s.nextInt();
            if(age>=18)
            System.out.println("You are eligible for a driving license");
            else
            System.out.println("You are not eligible for a driving license");
            */

            //nested if -else
            System.out.println("Enter a,b and c");
            int a= s.nextInt();
            int b= s.nextInt();
            int c= s.nextInt();
            if(a>c){
                if(a>b)
                System.out.println("a is greatest among the three");
                else
                System.out.println("b is greatest among the three");
            }
            else{
                if(b>c)
                System.out.println("b is greatest among the three");
                else
                System.out.println("c is greatest among the three");
            }
            s.close();
}
}