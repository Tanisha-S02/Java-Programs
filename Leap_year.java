import java.util.Scanner;

public class Leap_year{
        public static void main(String[] args){ 
            Scanner sc=new Scanner(System.in);
            int year,t;
           
           do{
            System.out.println("enter the  year :");
            year = sc.nextInt();
            if(year%4==0 && year<=2022)
            System.out.println("The entered year is a leap year!");
            else
            System.out.println("The year is not a  leap year");

            System.out.println("press 0 to exit and 1 to continue!");
            t= sc.nextInt();
            } 
            while(t==1);
            if(t==0)
            sc.close();

        }
}
