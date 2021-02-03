package shapes;

 public class Square extends Quadrilateral {

     Square(int side){
         super(side,side);
     }

     public void setLength(int length) {
         this.length=width;
         this.width=width;

     }
     void setWidth(int width) {
        this.length=width;
        this.width=width;
     }

     public double getPerimeter() {
         return 2*length+2*width;
     }

     @Override
     public double getArea() {
         return length*width;
     }

     //code from inheritance and polymorphism lecture

//
//     private int side;
//     public int getArea(){
//         return this.side*this.side;
//     }
//     public int getPerimeter(){
//         return this.side*4;
//     }
//    Square (int side){
//        super(side, side);
//        this.side=side;
//    }

}
