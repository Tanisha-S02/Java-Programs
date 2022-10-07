import java.util.Scanner;

public class tax{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            float income,tax=0;
            System.out.println("Enter your income in lakhs:");
            income=sc.nextFloat();
            sc.close();

            if(income<2.5f)
            tax= tax+0;

            else if(income>2.5f && income<5f)
            tax=tax+ (income-2.5f)*.05f;

           else if(income>5.0f && income<=10.0f)
            tax= tax + (income-5f)*.2f;

            else if(income>10.0f)
            tax=tax+ (income-10f)*.3f;

            System.out.println("Tax to be paid is "+ tax+"lakhs");
}
}