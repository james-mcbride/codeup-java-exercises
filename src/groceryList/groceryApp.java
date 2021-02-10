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
        Boolean keepGoing = true;
        System.out.println("Would you like to create a grocery list? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("n")) {
            System.out.println("Have a great day!");
            keepGoing = false;
        }
        while (keepGoing){
            System.out.println("Would you like to add a new item? (y/n)");
            String addItem = scanner.nextLine();
            if (addItem.equalsIgnoreCase("y")){
                System.out.println("Please pick a category from the list below");
                int categoryCounter=0;
                ArrayList<String> categoriesArray = new ArrayList<>();
                for (Map.Entry<String, ArrayList<String>> entry : myCategories.categories.entrySet()) {
                    System.out.println(categoryCounter +". "+entry.getKey());
                   categoriesArray.add(entry.getKey());
                   categoryCounter++;
                }
                int categoryIndex = Integer.parseInt(scanner.nextLine());
                String category = categoriesArray.get(categoryIndex);
                System.out.println("Please pick one of the following: ");
                ArrayList<String> categoryChosen = myCategories.categories.get(category);
                for (int i = 0; i < categoryChosen.size(); i++) {
                    System.out.println(i+". "+categoryChosen.get(i));
                }
                int chosenFoodIndex=Integer.parseInt(scanner.nextLine());
                String chosenFood = categoryChosen.get(chosenFoodIndex);
                System.out.println("Enter a quantity");
                int quantity = Integer.parseInt(scanner.nextLine());
                customList.addFood(category, chosenFood, quantity);
                customList.reviewCart();
                } else{
                keepGoing=false;
                System.out.println("Your final shopping cart is the following: ");
                customList.reviewCart();
            }
        }
    }
}

