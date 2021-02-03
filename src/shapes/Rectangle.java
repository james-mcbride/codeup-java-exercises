package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    Rectangle(int length, int width){
        super(length, width);
    }

    public void setLength(int length) {
        this.length=length;
    }
    public void setWidth(int width) {
        this.width-=width;
    }

    public double getPerimeter() {
        return 2*length+2*width;
    }

    public double getArea() {
        return length*width;
    }



    //code from inheritance and polymorphism lecture

//    protected int length;
//    protected int width;
//    Rectangle(int length, int width){
//        this.length=length;
//        this.width=width;
//    }
//
//    public int getArea(){
//        return length*width;
//    }
//    public int getPerimeter(){
//        return 2*length + 2*width;
//    }

}
