package arrays;

import java.util.Arrays;

public class ArrayLec {
    // Let's have some fun with arrays!

    public static void main(String[] args) {

        /* ***************   ******** ********************* */
        /* ******** WORKING WITH ARRAY ELEMENTS *********** */
        /* ************* ITERATING ARRAYS ***************** */
        /* ***************   ******** ********************* */

        // TODO: 1. Declare an int array called numbers without populating it
        int[] numbers;
        //       2. Declare a String array called words with a length of 10
        String[] words= new String[10];
        //       3. Initialize an int array called temps with the 'array initializer syntax'
        int[] temps = {30,31,32,33,34};

        // TODO: 1. Using a for loop, iterate through the temps array and print each temp on a new line
        for (int i=0; i<temps.length; i++){
            System.out.println(temps[i]);
        }
        //       2. Using an advanced for, iterate through the temps array and print each temp on a new line
        for (int temp: temps){
            System.out.println(temp);
        }
        //       3. Re-assign the third element with a temp of 38
        temps[2]=38;

        //       4. Print "Updated third temp: 38" to the console, using printf
        System.out.printf("Updated third temp: %d\n", temps[2]);


        // TODO: 1. Create a string called 'horns', populated with 4 values, using array initializer syntax
        String[] horns={"deer", "buck", "reindeer", "doe"};
        //       2. Print a random element to the screen, saying "_random_ is the best manufacturer!"
        int randomInt=(int)Math.floor(Math.random()*horns.length);
        System.out.printf("%s is the best manufacturer", horns[randomInt]);




        /* ***************   ******** ********************* */
        /* ********* **** THE ARRAYS CLASS **** *********** */
        /* **************** 2D ARRAYS ********************* */
        /* ***************   ******** ********************* */

        // TODO: 1. Create an 'Instructor' class that stores an instructor's
        //           -- firstName
        //           -- lastName
        //           -- brainWaveFrequency
        //        -- Also, keep a count of the total number of instructors
        //       2. Print to the console when an instructor has been created
        //       3. Create Getters and Setters for names / brainwavefreq
        //       4. Create a method to display instructor stats
        //       5. Initialize an array full of instructor objects
        final int KALYPSO_TEAM=3;
        Instructor[] team = new Instructor[KALYPSO_TEAM];
        //       6. Instantiate three instructors (casey,vivian,trant)
        Instructor casey = new Instructor("Casey", "Friday");
        Instructor fernando = new Instructor("Fernando", "Medoza");
        Instructor daniel = new Instructor("Daniel", "Fryar");

        //       7. Set each instructor's BrainWaveFrequency
        casey.setBrainWaveFrequency(4600000);
        daniel.setBrainWaveFrequency(12);
        fernando.setBrainWaveFrequency(800);
        //       8. Add those instructors in the Instructor object array
        team[0]=casey;
        team[1]=daniel;
        team[2]=fernando;
        //       9. Iterate through the Instructor object array, and display each instructor's stats
        for (int i=0; i<team.length; i++){
            System.out.println(team[i].displayStats());
        }
        //       10. Create an array with only first names in it, and display it to the console
        String[] firstNames = new String[KALYPSO_TEAM];
        for (int i=0; i<team.length; i++){
            firstNames[i]=team[i].getFirstName();
        }
        System.out.println(Arrays.toString(firstNames));

        //       11. Sum the brainwave frequencies, and display the total to the console
        int brainWaveTotal=0;
        for (Instructor person: team){
            brainWaveTotal+= person.getBrainWaveFrequency();
        }
        System.out.println("brainWaveTotal = " + brainWaveTotal);
		//       12. Sum the brainwave frequencies, and display the total to the console
        //       13. Create a 2D array, and print it to the console, in grid form

    }
}
