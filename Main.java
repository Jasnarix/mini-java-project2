public class Main{
      public void fullThrottle(){
        System.out.println("Woah thats fast!");
        }
      public void speed(int maxSpeed) {
        System.out.println("You're going "+ maxSpeed);
      }    


    public static void main(String[] args){
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}

