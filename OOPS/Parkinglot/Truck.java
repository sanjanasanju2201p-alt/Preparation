package Preparation.OOPS.Parkinglot;

public class Truck  extends Vehicle {
     public Truck(String licenseplate){
        super(licenseplate,"Truck");
    }
@Override
public double getchargeperhour(){
    return 150;

}

    
}
