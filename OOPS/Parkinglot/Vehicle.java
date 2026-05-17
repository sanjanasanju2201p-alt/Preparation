package Preparation.OOPS.Parkinglot;

public abstract class Vehicle {
    protected String vehicletype;
    protected String licenseplate;
    public Vehicle(String vehicletype,String licenseplate){
        this.licenseplate=licenseplate;
        this.vehicletype=vehicletype;

    }
    public String getvehicletype(){
        return vehicletype;
    }
    public String getlicenseplate(){
        return licenseplate;
    }
    public abstract double getchargeperhour();

}
