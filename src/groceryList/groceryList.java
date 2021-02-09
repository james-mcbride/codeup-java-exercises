package groceryList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class groceryList {
    private ArrayList<HashMap<String, Integer>> fruit;
    private ArrayList<HashMap<String, Integer>> vegetables;
    private ArrayList<HashMap<String, Integer>> frozen;
    private ArrayList<HashMap<String, Integer>> meat;

    private HashMap<String, ArrayList<HashMap<String, Integer>>> categories;
    groceryList() {
        this.categories = new HashMap<>();
        this.fruit = new ArrayList<>();
        this.vegetables = new ArrayList<>();
        this.frozen = new ArrayList<>();
        this.meat = new ArrayList<>();
        categories.put("Fruit", fruit);
        categories.put("Vegetables", vegetables);
        categories.put("Frozen", frozen);
        categories.put("Meat", meat);
    }

    public void addFood(String category, String food, int quantity){
        HashMap<String, Integer> foodOrder = new HashMap<>();
        foodOrder.put(food, quantity);
        this.categories.get(category).add(foodOrder);
    }

    public void reviewCart(){
        for (Map.Entry<String, ArrayList<HashMap<String, Integer>>> entry: this.categories.entrySet()) {
            System.out.println(entry.getKey()+":");
            for(int i=0; i<entry.getValue().size(); i++){
                System.out.println("   "+ entry.getValue().get(i));
            }
        }
    }
}
