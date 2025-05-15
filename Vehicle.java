public class Vehicle {

    public void start(){
        System.out.println("Vehicle starts");
    }

    public void stop(){
        System.out.println("Vehicle stops ");
    }
}

class Car extends Vehicle{
      private int numberOfSeats;

      public Car(int nums){
          this.numberOfSeats = nums;
      }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start(){
        System.out.println("Car starts");
    }

    @Override
    public void stop(){
        System.out.println("Car stops");
    }


}
