package Preparation.OOPS.Parkinglot;

public class Bike extends Vehicle {
    public Bike(String licenseplate){
        super(licenseplate,"Bike");
    }
@Override
public double getchargeperhour(){
    return 20.0;

}

    
    
}
