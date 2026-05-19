package Preparation.OOPS.MiniProjects.ShapeCalculator;

public class Circle extends Shape {
    private double radius;
    public Circle(double rad){
        this.radius=rad;
    }
    @Override
    public void area(){
         area = 3.14*radius*radius;
         System.out.println("area"+area);
    }
    @Override
    public void perimeter(){
        perimeter=2*3.14*radius;
        System.out.println("perimeter"+perimeter);
    }
    
}
