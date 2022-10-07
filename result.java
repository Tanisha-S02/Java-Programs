import java.util.Scanner;

public class result{
        public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter your  marks  in all subjects out of 100 each:");
         float math= sc.nextFloat();  
         float phy= sc.nextFloat();  
         float chem= sc.nextFloat(); 
         sc.close();
         float total= (phy+math+chem)/3;
         if(total>=40 && math>=33 && phy>=33 && chem>=33)
         System.out.println("You have passed with "+total+"%");
         else
         System.out.println("You have failed!");
}
}