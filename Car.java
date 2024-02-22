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
        return (this.maxPeople - passengers.size());
    }

    //adds a passenger only if there are seats remaining in the car, returns true if the person is successfully added and false if they are not.
    public boolean addPassenger(Passenger p){
        if(this.seatsRemaining() > 0){
            //if the car already contains that passenger, they can't board the car again
            if(passengers.contains(p)){
                return false;
            }
            else{
                passengers.add(p);
                return true;
            }
        }
        else{
            return false;
        }
    }

    //Checks to see if the passenger is indeed in the car and removes them if they are, returning true. If they are not in the car, it returns false.
    public boolean removePassenger(Passenger p){
        if(passengers.contains(p)){
            passengers.remove(p);
            return true;
        }
        else{
            return false;
        } 
    }

    //Compiles the manifest, to be printed by "getManifest"
    public String printManifest(){
        if(passengers.size() == 0){
            return "This car is EMPTY.";
        }
        else{
            for(int i = 0 ; i < passengers.size() ; i++){
                System.out.println(passengers.get(i).name);
            }
            return "End manifest";
            
        }
        
    }

    public static void main(String[] args) {
        Passenger pass1 = new Passenger("Mary");
        Passenger pass2 = new Passenger("Danny");
        Passenger pass3 = new Passenger("Lisa");
        Passenger pass4 = new Passenger("Coa");
        Car myCar = new Car(5);
        System.out.println(myCar.addPassenger(pass1));
        //System.out.println(myCar.seatsRemaining());
        //System.out.println(myCar.addPassenger(pass1));
        //System.out.println(myCar.seatsRemaining());
        System.out.println(myCar.addPassenger(pass2));
        //System.out.println(myCar.removePassenger(pass1));
        //System.out.println(myCar.seatsRemaining());
        System.out.println(myCar.addPassenger(pass3));
        //System.out.println(myCar.seatsRemaining());
        //System.out.println(myCar.removePassenger(pass4));
        //System.out.println(myCar.seatsRemaining());
        System.out.println(myCar.printManifest());

        

    }
}