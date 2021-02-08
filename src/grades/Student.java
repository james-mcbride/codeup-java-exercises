package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;
    private ArrayList<String> absentDays;
    Student(String name){
        this.name=name;
        this.grades=new ArrayList<>();
        this.attendance= new HashMap<>();
        this.absentDays= new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double totalGrade=0;
        for (int i=0; i<grades.size(); i++){
            totalGrade+=grades.get(i);
        }
        return totalGrade/grades.size();
    }
    public String getGrades(){
        return this.grades.toString();
    }

    public void recordAttendance(String date, String value){
        if (value.equalsIgnoreCase("a")) {
            this.attendance.put(date, value);
            this.absentDays.add(date);
        } else if(value.equalsIgnoreCase("p")){
            this.attendance.put(date, value);
        }
    }

    public double attendanceRecord(){
        double daysAbsent=0;
        for (Map.Entry<String, String> entry : this.attendance.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("a")){
                daysAbsent+=1;
            }
        }
        return (this.attendance.size()-daysAbsent)/this.attendance.size();
    }
    public ArrayList<String> getAbsentDays(){
        return this.absentDays;
    }



    public static void main(String[] args) {
        Student student1=new Student("Jimmie");
        student1.addGrade(92);
        student1.addGrade(93);
        student1.addGrade(99);
        System.out.println(student1.getGradeAverage());
    }

}
