public class ControlFlowExercises {
    public static void main(String[] args) {
        for (int i=5; i<=100; i++) {
            if (i%15==0){
                System.out.println("fizzBuzz");
            }else if (i%3==0) {
                System.out.println("fizz");
            } else if (i%5==0){
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
