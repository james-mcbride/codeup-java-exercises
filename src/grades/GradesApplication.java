package grades;
import java.util.HashMap;
import java.util.Scanner;
public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student jimmie = new Student("Jimmie");
        jimmie.addGrade(92);
        jimmie.addGrade(95);
        jimmie.addGrade(97);
        Student jessie = new Student("Jessie");
        jessie.addGrade(89);
        jessie.addGrade(87);
        jessie.addGrade(85);
        Student pippin = new Student("Pippin");
        pippin.addGrade(100);
        pippin.addGrade(99);
        pippin.addGrade(98);
        students.put("jimmie-rocks", jimmie);
        students.put("jessie-rocks", jessie);
        students.put("pippin-rocks", pippin);
//        System.out.println(students);

        //next is our console interaction
        Boolean keepGoing=true;
        while (keepGoing) {
            System.out.println("Pick one of the following github usernames to view more info about them. ");
            System.out.println(students.keySet());
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (students.get(input) == null) {
                System.out.println("The username you entered was not found");
            } else {
                System.out.println(students.get(input).getName());
                System.out.println(students.get(input).getGradeAverage());
            }
            System.out.println("Would you like to continue? (y/n)");
            String feedback = scanner.nextLine();
            if (feedback.equalsIgnoreCase("n")){
                keepGoing=false;
            }
        }
    }
}
