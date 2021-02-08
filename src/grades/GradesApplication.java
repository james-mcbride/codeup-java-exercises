package grades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student jimmie = new Student("Jimmie");
        jimmie.addGrade(92);
        jimmie.addGrade(95);
        jimmie.addGrade(97);
        jimmie.recordAttendance("2021-01-08", "p");
        jimmie.recordAttendance("2021-01-09", "p");
        jimmie.recordAttendance("2021-01-20", "a");

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
            System.out.println("\nOr type 'all' to view all the students grades");
            System.out.println("Or type 'average' to view class average");
            System.out.println("Or type 'report' to view report of all students grades.");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
             if(input.equalsIgnoreCase("all")){
                students.forEach((k,v)-> System.out.println(k + ": "+ v.getGrades()));
            }else if(input.equalsIgnoreCase("average")){
                 double classTotal=0;
                 for (Map.Entry<String, Student> entry : students.entrySet()) {
                     classTotal+=entry.getValue().getGradeAverage();
                 }
                 System.out.println(classTotal/students.size());
             }
             else if(input.equalsIgnoreCase("report")){
                 System.out.println("name, github_username, average");
                 for (Map.Entry<String, Student> entry : students.entrySet()) {
                     System.out.println(entry.getValue().getName()+","+entry.getKey()+","+entry.getValue().getGradeAverage());
                 }
             }else if (students.get(input) == null) {
                System.out.println("The username you entered was not found");
            }  else {
                System.out.println(students.get(input).getName());
                System.out.println("Grade Average: "+students.get(input).getGradeAverage());
                System.out.println("All grades: "+students.get(input).getGrades());
                 System.out.println("Attendance record: "+students.get(input).attendanceRecord());
                 System.out.println("Days absent: "+ students.get(input).getAbsentDays());
            }
            System.out.println("Would you like to continue? (y/n)");
            String feedback = scanner.nextLine();
            if (feedback.equalsIgnoreCase("n")){
                keepGoing=false;
            }
        }
    }
}
