//There are 4 modifiers : public,private protected and default
class Student{
    private int roll;
    private String name;

    public Student(){
        roll=45;
        name="Muskan";
    }

    void setname(String n){
        name=n;
    }
    String getname(){
        return name;
    }
    void setroll(int n){
        roll=n;
    }
    int getroll(){
        return roll;
    }
}

public class Constructors{

    public static void main(String[] args){
            Student s1= new Student();
            // s1.setname("muskan");
            // s1.setroll(25);
            System.out.println(s1.getname());
            System.out.println(s1.getroll());
}
}