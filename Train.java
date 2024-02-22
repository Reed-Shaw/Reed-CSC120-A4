import java.util.ArrayList;

public class Train {

    Engine engine;
    ArrayList<Car> cars;
    int passengerCapacity;
    Car car1 = new Car(5);
    Car car2 = new Car(5);
    Car car3 = new Car(5);
    Car car4 = new Car(5);
    Car car5 = new Car(5);

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>(nCars);
        this.cars.add(car1);
        this.cars.add(car2);
        this.cars.add(car3);
        this.cars.add(car4);
        this.cars.add(car5);
    }

    public Engine getEngine(){
        return this.engine;
    }

    //return the ith car.
    public Car getCar(int i){
        return cars.get(i);
    }

    //returns max capacity of the whole train
    public int getMaxCapacity(){
        int max = 0;
        for(Car car : this.cars){
            max += car.getCapacity();
       }
       return max;
    }

    //returns the total remaining seats of the whole train
    public int seatsRemaining(){
        int seatsLeft = 0;
        for(Car car : this.cars){
            seatsLeft += car.seatsRemaining();
       }
       return seatsLeft;
    }

    //makes a big manifest of everyone on the train. 
    public String getManifest(){
        String manifest = "";
        for (Car car : this.cars){
            manifest += car.printManifest();
        }
        return manifest;
    }


    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.OTHER,100.0, 4, 25);
        System.out.println(myTrain.seatsRemaining());
        
        
    }

}
