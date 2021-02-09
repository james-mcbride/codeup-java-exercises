package groceryList;
import grades.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class groceryApp {

    public static void main(String[] args) {
        groceryCategories myCategories = new groceryCategories();

        groceryList customList = new groceryList();

        System.out.println("Would you like to create a grocery list? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")){
            System.out.println("Please pick a category from the list below");
            for (Map.Entry<String, ArrayList<String>> entry: myCategories.categories.entrySet()) {
                System.out.println(entry.getKey());
            }
            String category = scanner.nextLine();
            System.out.println("Please pick one of the following: ");
            ArrayList<String> categoryChosen = myCategories.categories.get(category);
            for (int i=0; i<categoryChosen.size(); i++){
                System.out.println(categoryChosen.get(i));
            }
            String chosenFood=scanner.nextLine();
            System.out.println("Enter a quantity");
            int quantity = Integer.parseInt(scanner.nextLine());
            customList.addFood(category,chosenFood, quantity);
            customList.reviewCart();

            System.out.println();






        }

    }
}

