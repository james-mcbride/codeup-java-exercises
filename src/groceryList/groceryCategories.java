package groceryList;

import java.util.ArrayList;
import java.util.HashMap;

public class groceryCategories {
    public ArrayList<String> fruit;
    public ArrayList<String> vegetables;
    public ArrayList<String> frozen;
    public ArrayList<String> meat;
    public ArrayList<String> dairy;

    public HashMap<String, ArrayList<String>> categories;

    groceryCategories(){
        this.categories= new HashMap<>();
        this.fruit= new ArrayList<>();
        this.vegetables= new ArrayList<>();
        this.frozen= new ArrayList<>();
        this.meat= new ArrayList<>();
        this.dairy = new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("grapes");
        fruit.add("strawberries");
        vegetables.add("lettuce");
        vegetables.add("tomato");
        vegetables.add("cucumber");
        vegetables.add("zuchini");
        frozen.add("pizza");
        frozen.add("ice-cream");
        frozen.add("waffles");
        frozen.add("hashbrowns");
        meat.add("steak");
        meat.add("ham");
        meat.add("hot dogs");
        meat.add("chicken");
        dairy.add("milk");
        dairy.add("yogurt");
        dairy.add("butter");
        dairy.add("eggs");
        categories.put("Fruit", fruit);
        categories.put("Vegetables", vegetables);
        categories.put("Frozen", frozen);
        categories.put("Meat", meat);
        categories.put("Dairy", dairy);
    }

}
