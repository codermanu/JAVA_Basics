public class Car{
    //Create a full throttle method
     public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
     }

    // Create a speed() method and add a parameter
     public void speed(int maxspeed) {
         System.out.println("Max speed is : " + maxspeed);
     }

     public static void main(String[] args){
         Car myCar = new Car();
         myCar.fullThrottle();
         myCar.speed(230);
         
     }

     
    }
