public class Recursion{
    static int factorial(int n){
        if(n==1)
        return 1;

        return factorial(n-1)*n;
    }
    int fibonacci(int n){// here we make a class which will require an object!
        if(n==1 || n==0)
        return n;

        return fibonacci(n-1)+ fibonacci(n-2);
    }
        public static void main(String[] args){
            System.out.println(factorial(7));
            Recursion obj = new Recursion();
            System.out.println(obj.fibonacci(9)); 

}
}