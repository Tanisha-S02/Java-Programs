public class inheritance_in_interfaces{
    class instagram{
        void open(){
            System.out.println("Opening app");
        }
    }
    interface reels{
        void play();
        void pause();
    }
    interface posts{
        void like();
    }

    class muskan extends instagram implements reels,posts{
        public void play(){
         System.out.println("reel is being played!");
        }
        public void pause(){
         System.out.println("reel is paused!");
        }
        public void like(){
            System.out.println("Muskan liked this post");
        }
    }
        public static void main(String[] args){
            muskan m = new muskan();
            m.play();m.pause();
            m.like();
            m.open();

}
}