import java.util.Scanner;
public class Temperature_Conversion{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
           // for c to f conversion
            System.out.println("Enter the temperature in celsius");
            float celsius= sc.nextFloat();
            float Fahrenheit= (celsius*9/5)+32;
            System.out.println("Temperature in fahrenheit is "+ Fahrenheit);

            //for f to c conversion
          /*   System.out.println("Enter the temperature in fahrenheit");
            float Fahrenheit= sc.nextFloat();
            float celsius= (Fahrenheit-32)*5/9;
            System.out.println("Temperature in celsius is "+ celsius);
            */
            sc.close();
}

}