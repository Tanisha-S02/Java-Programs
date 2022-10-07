public class first {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int abc$_ = 5; // $ and _ are the only allowed special characters in the name.
        // first letter of a name cant be a number.
        System.out.print(abc$_);
        abc$_ = 10;
        System.out.print(abc$_);

        int i = 1; // 4byte--->32bits
        short s = 2; // 2byte--->16bits
        byte b = 3; // 1byte
        long l = 4; // 8bytes
        float f = 5.5f; // 4bytes
        double d = 6.6; // 8 bytes
        // char c = 'A'; // 2bytes
        // c = 66; // it will print b bcoz that is the ascii value!

        double d1 = 5; // implicit conversion
        int k = (int) 5.6; // type conversion
        System.out.println(k);

        System.out.print(i+l+f+d1+d);
        // operators
        int v=s*b;//5+b, 5*l..arithmetic op
        System.out.println(v);
        System.out.println(5==4);  //prints false    comparison op
        System.out.println(5>7 || 5>0);  //true...&&,!   logical operator
        System.out.println(2&3);// true (bitwise & operator)
        
    }
}