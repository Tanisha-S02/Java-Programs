class Animals{
	String a;
	
	 void geter(String b){
        a=b;
        System.out.println("Enter common property of animals: ");
	}
	 String seter(){
		return a;
	}
}

class dog extends Animals{
    int c;

    void getc(int d){
        System.out.println("Enter number of legs of dog:");
        c=d;
    }
    int setc(){
        System.out.print("Number of legs of dog is:");
        return c;

    }
}

public class Inheritance{
        public static void main(String[] args){
            dog whisky =new dog();
            whisky.geter("They can't speak");
            System.out.println(whisky.seter());
            

}
}