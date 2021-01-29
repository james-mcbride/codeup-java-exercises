package shapes;

import org.w3c.dom.ls.LSOutput;
import util.Input;
import java.util.Scanner;


public class CircleApp {
    public static int totalCircles=0;
    public static void CreateCircle(){

        Input input1 = new Input();
        double radius = input1.getDouble();
        Circle circle1 = new Circle(radius);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        System.out.println("Would you like to make another circle?");
        boolean response  = input1.yesNo();
        totalCircles++;
        if (response){
            CreateCircle();
        }
    }

    public static void main(String[] args) {
       CreateCircle();

    }

}
