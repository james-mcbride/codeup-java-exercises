package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        return input;
    }

    public  String getString(String prompt){
        System.out.println(prompt);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        return input;
    }
    public boolean yesNo(){
        System.out.println("Enter yes or no");
        String input =scanner.nextLine();
        boolean response;
        if (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")){
            response=true;
        } else if(input.equalsIgnoreCase("no")||input.equalsIgnoreCase("n")){
            response=false;
        } else{
            return yesNo();
        }
        return response;
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        System.out.println("Enter yes or no");
        String input =scanner.next();
        boolean response;
        if (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")){
            response=true;
        } else if(input.equalsIgnoreCase("no")||input.equalsIgnoreCase("n")){
            response=false;
        } else{
            return yesNo(prompt);
        }
        return response;
    }
    public int getInt(int min, int max){
        System.out.println("enter a value between "+min+" and "+ max);
        int input=scanner.nextInt();
        if (input>=min && input<=max){
            return input;
        } else{
            return getInt(min, max);
        }
    }
    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        System.out.println("enter a value between "+min+" and "+ max);
        int input=scanner.nextInt();
        if (input>=min && input<=max){
            return input;
        } else{
            return getInt(min, max);
        }
    }
    public int getInt(){
        System.out.println("enter an integer");
        int input=scanner.nextInt();
        return input;
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        System.out.println("enter an integer");
        int input=scanner.nextInt();
        return input;
    }

    public double getDouble (double min, double max){
        System.out.println("enter a value between "+min+" and "+max);
        double input = scanner.nextDouble();
        if (input>min && input<max){
            return input;
        } else{
            return getDouble(min, max);
        }
    }

    public double getDouble (double min, double max, String prompt){
        System.out.println(prompt);
        System.out.println("enter a value between "+min+" and "+max);
        double input = scanner.nextDouble();
        if (input>min && input<max){
            return input;
        } else{
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("enter a double");
        double input=scanner.nextDouble();
        return input;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        System.out.println("enter a double");
        double input=scanner.nextDouble();
        return input;
    }

    public Input (){

        this.scanner = new Scanner(System.in);
    }


}
