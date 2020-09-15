public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){

    }

    double getRadius() {
        return radius;
    }
    double getArea() {
        double Area = Math.floor(this.radius*this.radius*Math.PI) ;
        return Area;
    }
}
