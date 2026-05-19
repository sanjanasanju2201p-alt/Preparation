package Preparation.OOPS.MiniProjects.ShapeCalculator;

public class Triangle extends Shape {
    private double breadth;
    private double height;
    private double a;
    private double b;
    private double c;
    public Triangle(double bre, double hei,double a,double b,double c){
        this.breadth=bre;
        this.height=hei;
        this.a=a;
        this.b=b;
        this.c=c;
    }
    

    
    @Override
    public void area(){
        area=0.5*breadth*height;
        System.out.println("area"+area);

    }
    @Override
    public void perimeter(){
        perimeter=a+b+c;
        System.out.println("perimeter"+perimeter);
    }

    
}
