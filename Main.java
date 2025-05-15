

public class Main {
    public static void main(String[] args) {
        Car car = new Car(7);
        car.start();
        car.stop();
        System.out.println("Number of seats: " + car.getNumberOfSeats());
        System.out.println("-----------Task3------------");

        Animal[] bratanchiki = {new Lion(), new Cat(), new Wolf(), new Dog()};
        for (Animal bro : bratanchiki){
            bro.makeNoise();
        }
        System.out.println();
        System.out.println("-----------Task4------------");
        Animal[] bratanchiki2 = {new Lion(), new Cat(), new Wolf(), new Dog()};
        for (Animal bro : bratanchiki){
            bro.roam();
            bro.makeNoise();
            System.out.println("  ");
        }


    }
}