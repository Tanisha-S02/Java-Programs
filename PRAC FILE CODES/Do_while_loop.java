import java.util.*;
public class Do_while_loop{
        public static void main(String[] args){
          Scanner sc= new Scanner(System.in);

          //sum of positive numbers
         /* 
          System.out.println("enter n:"); 
          int n=sc.nextInt();
          int sum=0,i=0;
          do{
            sum+=i;
            i++;
          }while(i<=n);
          System.out.println("Sum of "+ n +" numbers is "+ sum);
          */

          //reverse of a number 
          System.out.println("enter the number to be reversed:");
          int n= sc.nextInt();

          int rem=0,rev=0;
          do{
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
          }while(n!=0);
          System.out.println("Reversed number is "+ rev);

}
}