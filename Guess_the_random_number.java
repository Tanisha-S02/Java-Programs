import java.util.Scanner;

public class Guess_the_random_number {
    public static void Game(){
        int n,i,trials = 10, count = 0;// here n stands for guess
        Scanner sc = new Scanner(System.in);

        // This will generate a random number between 1 to 100.
        int random = 1 + (int) (100 * Math.random());

        System.out.println( "Guess the number between 1 and 100.\nYou have 10 chances to do it.\nAll the best!");
        for (i = 1; i < 11; i++) {// guess within the number of trials!
            n = sc.nextInt();
            if (n == random)
                System.out.println("It's right! The number has been guessed in " + count + " moves");
            else if (n > random) {
                System.out.println("Go smaller than this!");
                count++;
            } else {
                System.out.println("Go larger than this!");
                count++;
            }

            if (i == trials)
            System.out.println("All the chances have been utilised.\nBetter luck next time.");
            sc.close();
        }
            
    }
    

    public static void main(String[] args) {
        Game();
    }
}