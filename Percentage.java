import java.util.Scanner;

public class Percentage{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks  in physics");
        int phy= sc.nextInt();

        System.out.println("Enter marks  in math");
        int math= sc.nextInt();

        System.out.println("Enter marks  in english");
        int eng= sc.nextInt();

        System.out.println("Enter marks  in chemistry");
        int chem= sc.nextInt();

        System.out.println("Enter marks  in Cs");
        int cs= sc.nextInt();
        sc.close();

        float percentage = ((phy+math+eng+chem+cs)/500.0f) *100;
        System.out.println("percentage = ");
        System.out.println(percentage);
        
    }
}