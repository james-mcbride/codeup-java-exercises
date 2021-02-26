import java.util.Scanner;

public class HighLow {
    public static long guessingGameUserInput(){
        Scanner scanner = new Scanner(System.in);
        long guess=scanner.nextLong();
        return guess;
    }
    public static void guessingGameFeedback(long guess, long randomNumber){
        if (guess<randomNumber){
            System.out.println("HIGHER");
            guessingGameFeedback(guessingGameUserInput(), randomNumber);
        } else if (guess>randomNumber){
            System.out.println("LOWER");
            guessingGameFeedback(guessingGameUserInput(), randomNumber);
        } else{
            System.out.println("GOOD GUESS");
        }
    }
    public static void guessingGame(){
        System.out.println("We have picked a random Number between 1 and 100, take a guess what it is!");
        long randomNumber =  Math.round(Math.random()*100);
        guessingGameFeedback(guessingGameUserInput(), randomNumber);
    }

    public static void main(String[] args) {
        guessingGame();
    }
}
