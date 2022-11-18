import java.util.*;

public class Palindrome{
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            System.out.println("Enter the number:");
            int n= s.nextInt();
            int temp=n;
            int rev=0,rem=0;
            while(n!=0){
                rem=n%10;
                rev=rev*10+rem;
                n/=10;
            }
            System.out.println(rev);

            if(rev==temp)
            System.out.println("The number is a palindrome.");
            else
            System.out.println("The number is not a palindrome.");
}
}