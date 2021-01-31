package shapes;

public class Circle {
    private double radius;

    public double getArea(){
        return Math.PI*radius*this.radius;
    }
    public double getCircumference(){
        return Math.PI*2*this.radius;
    }
    public Circle (double radius){
        this.radius=radius;
    }

}
