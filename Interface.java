interface phone{
    //  void phonedes(){
    //     System.out.println("I'm a phone.");
    // }
     void ring();
     void noti();
}

class vivo implements phone{
    public void noti(){
        System.out.println("There's a notification.");
    }
    public void ring(){
        System.out.println("Phone is ringing.");
    }
}

public class Interface{
        public static void main(String[] args){
            vivo a= new vivo();
            a.noti();a.ring();
}
}