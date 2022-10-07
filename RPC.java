import java.util.Scanner;
public class RPC{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
           //  rock='r',paper='p',scissor='s';
           int  countx=0,county=0;
           System.out.println("Enter number of rounds: ");
           int t= sc.nextInt();
           System.out.println("Enter 1 for rock,2 for paper and 3 for scissor :");

           while(t!=0){
           System.out.println("Entry for player 1: ");
            int x= sc.nextInt();
           System.out.println("Entry for player 2: ");
            int y= sc.nextInt();

            if(x==1 && y==2){
            System.out.println("Player 1 wins!");
            countx++;
            }
            else if(x==2 && y==1){
            System.out.println("Player 2 wins!");
            county++;
            }

            if(x==2 && y==3){
            System.out.println("Player 2 wins!");
            county++;
            }
            else if(x==3 && y==2){
            System.out.println("Player 1 wins!");
            countx++;
            }

            if(x==1 && y==3){
            System.out.println("Player 1 wins!");
            countx++;
            }
            else if(x==3 && y==1){
            System.out.println("Player 2 wins!");
            county++;
            }

            t--;
           }  
           if(countx>county)
           System.out.println("Player 1 wins with "+countx+" points"); 
           else if(countx<county)
           System.out.println("Player 2 wins with "+county+" points");   
           else
           System.out.println("It is a Tie"); 
           sc.close();
}
}