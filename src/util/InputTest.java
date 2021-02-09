package util;

public class InputTest {
    public static void main(String[] args) {
        Input input1= new Input();
//        input1.getString("Whassup Playa");
//        input1.yesNo("Whassup Playa");
        input1.getInt(1,4);
//        input1.getInt("Whassup Playa");
        input1.getDouble(2,5,"Whassup Playa");
//        input1.getDouble("Whassup Playa");
    }
}
