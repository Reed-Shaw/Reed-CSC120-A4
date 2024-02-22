public class Passenger {
    
    public String name;

    public Passenger(String name) {
        this.name = name;
    }

    private String boardCar(Car c){
        if(c.addPassenger(this)){
            c.addPassenger(this);
            return "The passenger boarded the car.";
        }
        else{
            return "The passenger was already in this car.";
        }
    }

    private String getOffCar(Car c){
        if(c.removePassenger(this)){
            c.removePassenger(this);
            return "The passenger got off the car.";
        }
        else{
            return "The passenger was not on this car.";
        }
    }

    public static void main(String[] args) {
        Passenger myPassenger = new Passenger("Hannah");
        Car myCar = new Car(5);
        Car newCar = new Car(5);
        System.out.println(myPassenger.boardCar(myCar));
        System.out.println(myCar.printManifest());
        System.out.println(myPassenger.getOffCar(newCar));
        System.out.println(myCar.printManifest());

    }
}
