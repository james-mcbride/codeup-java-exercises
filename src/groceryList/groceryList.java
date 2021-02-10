package groceryList;

import java.util.*;

public class groceryList {
    private ArrayList<HashMap<String, Integer>> fruit;
    private ArrayList<HashMap<String, Integer>> vegetables;
    private ArrayList<HashMap<String, Integer>> frozen;
    private ArrayList<HashMap<String, Integer>> meat;
    private ArrayList<HashMap<String, Integer>> other;



    private HashMap<String, ArrayList<HashMap<String, Integer>>> categories;
    groceryList() {
        this.categories = new HashMap<>();
        this.fruit = new ArrayList<>();
        this.vegetables = new ArrayList<>();
        this.frozen = new ArrayList<>();
        this.meat = new ArrayList<>();
        this.other = new ArrayList<>();
        categories.put("Fruit", fruit);
        categories.put("Vegetables", vegetables);
        categories.put("Frozen", frozen);
        categories.put("Meat", meat);
        categories.put("Other", other);
    }

    public void addFood(String category, String food, int quantity){
        HashMap<String, Integer> foodOrder = new HashMap<>();
        foodOrder.put(food, quantity);
        this.categories.get(category).add(foodOrder);
    }


    public void reviewCart(){
        for (Map.Entry<String, ArrayList<HashMap<String, Integer>>> entry: this.categories.entrySet()) {
            System.out.println(entry.getKey()+":");
            ArrayList<String> sortedFood = new ArrayList<>();
            for(int i=0; i<entry.getValue().size(); i++){
                for (Map.Entry<String, Integer> foods: entry.getValue().get(i).entrySet()) {
                    sortedFood.add(foods.getKey());
                }

//                System.out.println("   "+ entry.getValue().get(i));
            }
            Collections.sort(sortedFood);
            for (int i=0; i<sortedFood.size(); i++){
                for(int j=0; j<entry.getValue().size(); j++){
                    if (entry.getValue().get(j).get(sortedFood.get(i))!=null){
                        System.out.println("   "+sortedFood.get(i)+": "+entry.getValue().get(j).get(sortedFood.get(i)));
                    }
                }

            }
        }
    }
}
