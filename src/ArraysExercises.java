import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String numbersString=Arrays.toString(numbers);
        System.out.println(numbersString);

        Person[] people = {new Person("Jimmie McBride"), new Person("Jessie McBride"), new Person("Pippin and Molly")};

        Person[] newPeople=addToArray(people, new Person("Travis"));

        for (Person person: newPeople){
            System.out.println(person.getName());
        }

    }
    public static Person[] addToArray(Person[] personArray, Person newPerson){
        int arrayLength=personArray.length +1;
        Person[] people = new Person[arrayLength];
        for (int i=0; i<personArray.length; i++){
            people[i]= personArray[i];
        }
        people[arrayLength-1] = newPerson;
        return people;
    }

}
