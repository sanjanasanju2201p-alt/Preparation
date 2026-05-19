package Preparation.OOPS.MiniProjects.ShapeCalculator;

public abstract class Shape {
    protected double len;
    protected double bre;
    protected double hei;
    protected double rad;
    public Shape(double len,double bre,double hei,double rad){
        this.len=len;
        this.bre=bre;
        this.hei=hei;
        this.rad=rad;

    }
    public abstract void area(double rad,double hei,double len,double bre);
    public abstract void perimeter();
    Shape [] shapes=new Shape [3];
    shapes[0]=new circle(rad);
    shapes[1]=new Rectangle(len,bre);
    shapes[2]=new Triangle(hei,bre);
    for(int s:Shape){
        System.err.println("area"+area());
        System.out.println("perimeter"+perimeter());
    }


        


    
}
