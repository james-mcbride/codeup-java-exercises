package shapes;

 public class Square extends Rectangle {
     private int side;
     public int getArea(){
         return this.side*this.side;
     }
     public int getPerimeter(){
         return this.side*4;
     }
    Square (int side){
        super(side, side);
        this.side=side;
    }
}
