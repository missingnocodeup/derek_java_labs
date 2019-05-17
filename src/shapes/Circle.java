package shapes;

public class Circle {
    private double radius;
    public static int counter=0;
    public Circle(double radius){
        this.radius = radius;
        counter++;
    }
    public double getArea(){
       return Math.pow(radius, 2) * Math.PI;
    }
    public double getCircumference(){
        return (radius * 2 ) * Math.PI;
    }
}
