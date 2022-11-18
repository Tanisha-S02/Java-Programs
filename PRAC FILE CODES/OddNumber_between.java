import java.util.*;

public class OddNumber_between{
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            System.out.println("Enter upper and lower limit:");
            int a= s.nextInt();
            int z=s.nextInt();
            for(int i=a;i<=z;i++){
                if(i%2!=0)
                System.out.println(i);
            }
            s.close();
        }
    }