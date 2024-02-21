import java.util.ArrayList;

public class Car {

    int maxPeople;
    ArrayList<Passenger> passengers;

    public Car(int max_people){
        this.maxPeople = max_people;
        this.passengers = new ArrayList<Passenger>(this.maxPeople);
      
    }

    public int getCapacity(){
        return this.maxPeople;
    }

    public int seatsRemaining(){
        return (maxPeople - passengers.size());
    }

    public void addPassenger(Passenger p){
        passengers.add(p);
    }

}