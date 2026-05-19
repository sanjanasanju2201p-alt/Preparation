package Preparation.OOPS.MiniProjects.ShapeCalculator;

public class main {
    public static void main(String[] args) {

        Shape [] shapes=new Shape [3];
    shapes[0]=new Circle(7);
    shapes[1]=new Rectangle(4.0,3.0,2.0);
    shapes[2]=new Triangle(4,3,2,4,6);
    for(Shape s:shapes){
        s.area();
        s.perimeter();
    }
        
    }
    
}
