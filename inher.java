class car {
    String brand; 
    int year;



    public car(String brand, int year){
        this.brand = brand;
        this.year = year;

    }
}
    public void start(){
        system.out.println("Car is Starting......")
    }


    public void stop() {
        System.out.println(brand + " car is stopping...");
    }


    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }


class Electriccar  extends car{
    int batteryCapicity;


    public Electriccar(String brand, int year, int batteryCapicity){
        super(brand, year);
        this.batteryCapicity = batteryCapicity;
    }
}


class PetrolCar extends Car {
    int fuelLevel;

    public PetrolCar(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    public void refuel() {
        System.out.println(brand + " is refueling. Fuel: " + fuelLevel + "L");
    }
}