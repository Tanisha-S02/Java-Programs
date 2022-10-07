//There are 4 modifiers : public,private protected and default
class student{
    private int roll;
    private String name;

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

public class Modifiers{

    public static void main(String[] args){
            student s1= new student();
            s1.setname("muskan");
            s1.setroll(25);
            System.out.println(s1.getname());
            System.out.println(s1.getroll());
}
}