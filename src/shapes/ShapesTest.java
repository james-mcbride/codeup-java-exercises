package shapes;

import javax.lang.model.SourceVersion;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;
        Square square1= new Square(3);
        Rectangle rectangle1=new Rectangle(3,2);
        myShape=rectangle1;
        System.out.println(rectangle1.getArea());
        System.out.println(square1.getPerimeter());



        //code from inheritance and polymorphism lecture

//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getArea() = " + box2.getArea());
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
    }
}
