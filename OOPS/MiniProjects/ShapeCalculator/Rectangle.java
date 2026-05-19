package Preparation.OOPS.MiniProjects.ShapeCalculator;

public class Rectangle extends Shape {
    private double length;
    private double breadth;
    private double width;
    public Rectangle(double len,double bre,double wid){
        this.length=len;
        this.breadth=bre;
        this.width=wid;

    }
    @Override
    public void area(){
        area=length*breadth;
        System.out.println("area"+area);
    }
    @Override
    public void perimeter(){
        perimeter=2*(length+width);
        System.out.println("perimeter"+perimeter);
    }


    
}
