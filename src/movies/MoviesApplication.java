package movies;
import util.Input;
import java.util.Scanner;
public class MoviesApplication {
    public static void movieApplication() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");
        int response = scanner.nextInt();
        if (response ==0){
            System.out.println("Have a great day!");
        } else if(response ==1){
            for (Movie movie: movies){
                System.out.println(movie.getName()+" - "+ movie.getCategory());
            }
            Thread.sleep(1000);
            System.out.println("Would you like to continue? (y/n)");
            String feedback = scanner.next();
            if (feedback.equalsIgnoreCase("y")){
                movieApplication();
            } else{
                System.out.println("Thanks come again!");
            }
        } else if (response ==2){
            for (Movie movie: movies){
                if (movie.getCategory().equalsIgnoreCase("animated")) {
                    System.out.println(movie.getName()+" - "+ movie.getCategory());
                }
            }
            Thread.sleep(1000);
            System.out.println("Would you like to continue? (y/n)");
            String feedback = scanner.next();
            if (feedback.equalsIgnoreCase("y")){
                movieApplication();
            } else{
                System.out.println("Thanks come again!");
            }
        } else if (response ==3){
            for (Movie movie: movies){
                if (movie.getCategory().equalsIgnoreCase("drama")) {
                    System.out.println(movie.getName()+" - "+ movie.getCategory());
                }
            }
            Thread.sleep(1000);
            System.out.println("Would you like to continue? (y/n)");
            String feedback = scanner.next();
            if (feedback.equalsIgnoreCase("y")){
                movieApplication();
            } else{
                System.out.println("Thanks come again!");
            }
        }  else if (response ==4){
            for (Movie movie: movies){
                if (movie.getCategory().equalsIgnoreCase("horror")) {
                    System.out.println(movie.getName()+" - "+ movie.getCategory());
                }
            }
            Thread.sleep(1000);
            System.out.println("Would you like to continue? (y/n)");
            String feedback = scanner.next();
            if (feedback.equalsIgnoreCase("y")){
                movieApplication();
            } else{
                System.out.println("Thanks come again!");
            }
        }  else if (response ==5){
            for (Movie movie: movies){
                if (movie.getCategory().equalsIgnoreCase("scifi")) {
                    System.out.println(movie.getName()+" - "+ movie.getCategory());
                }
            }
            Thread.sleep(1000);
            System.out.println("Would you like to continue? (y/n)");
            String feedback = scanner.next();
            if (feedback.equalsIgnoreCase("y")){
                movieApplication();
            } else{
                System.out.println("Thanks come again!");
            }
        } else{
            movieApplication();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        movieApplication();
    }
}
