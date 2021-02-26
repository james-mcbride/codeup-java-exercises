import java.util.Scanner;

public class MethodsExercises {
//    public static void add(int num1, int num2) {
//        System.out.println(num1+num2);
////        return num1 + num2;
//    }
//    public static void subtract(int num1, int num2) {
//        System.out.println((num1 - num2));
////        return num1 - num2;
//    }
//    public static void multiply(int num1, int num2) {
//        int startingNum = num1;
//        for (int i =1; i<num2; i++){
//            num1+=startingNum;
//        }
//        System.out.println(num1);
////        return num1 * num2;
//    }
//public static int multiply(int num1, int num2) {
//    if (num2==0){
//        return 0;
//    } else if(num2==1){
//        return num1;
//    }
//    return num1+multiply(num1,(num2-1));
////        return num1 * num2;
//}
//    public static void divide(int num1, int num2) {
//        System.out.println(num1 / num2);
////        return num1/ num2;
//    }

    public static long getInteger (long min, long max){
        System.out.println("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        long response = scanner.nextLong();
        if (response<min || response>max){
            return getInteger(min, max);
        } else{
            return response;
        }
    }

    public static long factorial(long num){
        //below is the factorial with a for-loop
//        int result=1;
//        for (int i=1; i<=num; i++){
//            result*=i;
//        }
//        return result;
//        if (num<1 || num>10){
//            System.out.println("Input a number between 1 and 10");
////            long newInput =
//            return factorial(num);
//        }
        if (num==0){
            return 0;
        } else if (num ==1){
            return num;
        }
        return num*factorial(num-1);
    }


//    public static void main(String[] args) {
//       long response = getInteger(1, 20);
//      System.out.println(factorial(response));
//    }
    public static long diceSides(){
        System.out.println("How many sides should your dice have?");
        Scanner scanner = new Scanner(System.in);
        long response = scanner.nextLong();
        return response;
    }
    public static void rollDice(long diceSides){
        long randomNumber1 = Math.round(Math.random()*diceSides);
        long randomNumber2 = Math.round(Math.random()*diceSides);
        System.out.println("You rolled " + randomNumber1 + " & " + randomNumber2);
        System.out.println("Want to roll again?");
        Scanner scanner = new Scanner(System.in);
        String response2=scanner.nextLine();
        if (response2.equalsIgnoreCase("yes") || response2.equalsIgnoreCase("y") ){
             rollDice(diceSides());
        } else{
            System.out.println("Thanks for playing!");
        }
    }

//    public static void main(String[] args) {
//        rollDice(diceSides());
//    }




}
