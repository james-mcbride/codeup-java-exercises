import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);

        //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter an integer: ");
//            int nextInt = scanner.nextInt();
//
//            System.out.println("you entered: "+ nextInt);



        //What happens if you input something that is not an integer?
        //exception in thread "main"

        //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter three words: ");
//        String string1 = scanner.next();
//        String string2 = scanner.next();
//        String string3 = scanner.next();
//        System.out.printf("You entered "+ string1+ " "+ string2+ " "+ string3);


        //What happens if you enter less than 3 words?
        //the terminal will keep waiting for an answer.

        //What happens if you enter more than 3 words?
        //It will only show the first thee words

        //Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String string1 = scanner.next();
//        System.out.printf("You entered: "+ string1);

        //do you capture all the words?
        // No only the first word before the first space

        //Rewrite the above example using the nextLine method.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String string1 = scanner.nextLine();
//        System.out.printf("You entered: "+ string1);

//
        //Prompt the user to enter values of length and width of a classroom at Codeup.
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
           System.out.println("Enter the length of a classroom at codeup: ");
           String string1=scanner.nextLine();
           System.out.println("Enter the width of a classroom at codeup: ");
           String string2=scanner.nextLine();

//        System.out.println("Enter the length and width of a classroom at codeup: ");
//        String string1=scanner.next();
//        String string2=scanner.next();


        //Use the nextLine method to get user input and parse the resulting string to a numeric type.



        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.
        //Display the area and perimeter of that classroom.
//        System.out.printf("The area of the room is: "+ Integer.parseInt(string1)*Integer.parseInt(string2)+"\n");
//        System.out.printf("The perimeter of the room is: "+ (2*Integer.parseInt(string1)+2*Integer.parseInt(string2)));
//
        //In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
//        System.out.printf("The area of the room is: "+ Double.parseDouble(string1)*Double.parseDouble(string2)+"\n");
//        System.out.printf("The perimeter of the room is: "+ (2*Double.parseDouble(string1)+2*Double.parseDouble(string2)));

        //Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
        System.out.printf("The area of the room is: "+ Integer.parseInt(string1)*Integer.parseInt(string2)+"\n");
        System.out.printf("The perimeter of the room is: "+ (2*Integer.parseInt(string1)+2*Integer.parseInt(string2)));


    }
}
