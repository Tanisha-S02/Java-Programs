import java.util.Random;
import java.util.Scanner;

           
public class RPScomputer{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number of rounds: ");
           int t= sc.nextInt();

            System.out.println("Enter 0 for rock,1 for paper and 2 for scissor :");
            while(t!=0){
            int user = sc.nextInt();

            Random random= new Random();
            int computer= random.nextInt(3);
            if(user==computer)
            System.out.println("Draw");
            else if((user==1 && computer==0)|| (user==2 && computer==1) || (user==0 && computer==2)) 
            System.out.println("You win!");
            else 
            System.out.println("Computer wins!");

            t--;
            }
            sc.close();
}
}