
public class Engine {

    FuelType fuelType;
    double maxFuel;
    double currentFuel;

    public Engine(FuelType fuel_type, double max_fuel){
        this.fuelType = fuel_type;
        this.maxFuel = max_fuel;
        this.currentFuel = max_fuel; 
    }

    //Show fuel type
    public FuelType show_fuel_type(){
        return this.fuelType;
    }

    //Show max fuel
    public double show_max_fuel(){
        return this.maxFuel;
    }

    //Show current fuel
    public double show_current_fuel(){
        return this.currentFuel;
    }

    //refuel method
    private void refuel_engine(){
        this.currentFuel = this.maxFuel;
    }    

    //go method will reduce fuel amount
    //True means there is still fuel, False means fuel level is at zero. 
    private boolean go(){
        this.currentFuel -= 25;
        System.out.println(currentFuel);
        if (this.currentFuel > 0){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        System.out.println(myEngine.show_current_fuel());
        myEngine.refuel_engine();
        System.out.println(myEngine.show_current_fuel());
        System.out.println(myEngine.go());
        System.out.println(myEngine.go());
        System.out.println(myEngine.go());
        myEngine.refuel_engine();
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");


        
    }
}