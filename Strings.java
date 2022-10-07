
public class Strings{
    public static void main(String[] args) {
        // String name= new String("Muskan");
        int a=2,b=3;
        String name= "MUSKAN";
       /*  // Different ways to print :
        System.out.print("name is : ");
        System.out.println(name);
        System.out.printf("the value of a is %d and of b is %d \n",a,b);
        System.out.format(name);
        */
        // commonly used string methods: 
        System.out.println(name);
        System.out.println(a+b);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        String nontrimmed= "        muskan";
        System.out.println(nontrimmed);
        System.out.println(nontrimmed.trim());
        System.out.println(name.substring(2));
        System.out.println(name.subSequence(2, 5));
        System.out.println(name.replace('M', 'f'));
        System.out.println(name.replace("MU", "hus"));
        System.out.println(name.startsWith("MU"));// end  with works similarly
        System.out.println(name.charAt(3)); //character at index 3
        System.out.println(name.indexOf('S'));
        
    }
}