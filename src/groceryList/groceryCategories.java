package groceryList;

import java.util.ArrayList;
import java.util.HashMap;

public class groceryCategories {
    public ArrayList<String> fruit;
    public ArrayList<String> vegetables;
    public ArrayList<String> frozen;
    public ArrayList<String> meat;

    public HashMap<String, ArrayList<String>> categories;

    groceryCategories(){
        this.categories= new HashMap<>();
        this.fruit= new ArrayList<>();
        this.vegetables= new ArrayList<>();
        this.frozen= new ArrayList<>();
        this.meat= new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("grapes");
        vegetables.add("lettuce");
        vegetables.add("tomato");
        vegetables.add("cucumber");
        frozen.add("pizza");
        frozen.add("ice-cream");
        frozen.add("waffles");
        meat.add("steak");
        meat.add("ham");
        meat.add("hot dogs");
        categories.put("Fruit", fruit);
        categories.put("Vegetables", vegetables);
        categories.put("Frozen", frozen);
        categories.put("Meat", meat);
    }

}
