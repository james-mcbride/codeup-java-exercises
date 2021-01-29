package util;
import java.util.Scanner;


public class Input {
    private static Scanner scanner;

    public static String getString(){
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        return input;
    }

    public static String getString(String prompt){
        System.out.println(prompt);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        return input;
    }
    public static boolean yesNo(){
        System.out.println("Enter yes or no");
        String response =scanner.nextLine();
        if (response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y")){
            return true;
        } else{
            return false;
        }
    }
    public static boolean yesNo(String prompt){
        System.out.println(prompt);
        System.out.println("Enter yes or no");
        String input =scanner.nextLine();
        if (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")){
            return true;
        } else{
            return false;
        }
    }
    public static int getInt(int min, int max){
        System.out.println("enter a value between "+min+" and "+ max);
        int input=scanner.nextInt();
        if (input>=min && input<=max){
            return input;
        } else{
            return getInt(min, max);
        }
    }
    public static int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        System.out.println("enter a value between "+min+" and "+ max);
        int input=scanner.nextInt();
        if (input>=min && input<=max){
            return input;
        } else{
            return getInt(min, max);
        }
    }
    public static int getInt(){
        System.out.println("enter an integer");
        int input=scanner.nextInt();
        return input;
    }
    public static int getInt(String prompt){
        System.out.println(prompt);
        System.out.println("enter an integer");
        int input=scanner.nextInt();
        return input;
    }

    public static double getDouble (double min, double max){
        System.out.println("enter a value between "+min+" and "+max);
        double input = scanner.nextDouble();
        if (input>min && input<max){
            return input;
        } else{
            return getDouble(min, max);
        }
    }

    public static double getDouble (double min, double max, String prompt){
        System.out.println(prompt);
        System.out.println("enter a value between "+min+" and "+max);
        double input = scanner.nextDouble();
        if (input>min && input<max){
            return input;
        } else{
            return getDouble(min, max);
        }
    }

    public static double getDouble(){
        System.out.println("enter a double");
        double input=scanner.nextDouble();
        return input;
    }

    public static double getDouble(String prompt){
        System.out.println(prompt);
        System.out.println("enter a double");
        double input=scanner.nextDouble();
        return input;
    }

    public Input (){
        this.scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {

    }


}
