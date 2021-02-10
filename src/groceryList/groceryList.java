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
        ArrayList<String> sortedCategories = new ArrayList<>();
        for (Map.Entry<String, ArrayList<HashMap<String, Integer>>> entry: this.categories.entrySet()) {
            sortedCategories.add(entry.getKey());
        }
        Collections.sort(sortedCategories);

        for (int i=0; i<sortedCategories.size(); i++){
            if (this.categories.get(sortedCategories.get(i)).size()>0){
                System.out.println(sortedCategories.get(i));
            }
//        for (Map.Entry<String, ArrayList<HashMap<String, Integer>>> entry: this.categories.entrySet()) {

            ArrayList<String> sortedFood = new ArrayList<>();
            for (int j=0; j<this.categories.get(sortedCategories.get(i)).size(); j++) {
//            for(int i=0; i<entry.getValue().size(); i++){
                for (Map.Entry<String, Integer> foods : this.categories.get(sortedCategories.get(i)).get(j).entrySet()) {
                    sortedFood.add(foods.getKey());
                }
            }

//                System.out.println("   "+ entry.getValue().get(i));
            Collections.sort(sortedFood);
            for (int k=0; k<sortedFood.size(); k++){
                for(int l=0; l<this.categories.get(sortedCategories.get(i)).size(); l++){
                    if (this.categories.get(sortedCategories.get(i)).get(l).get(sortedFood.get(k))!=null){
                        System.out.println("   "+sortedFood.get(k)+": "+this.categories.get(sortedCategories.get(i)).get(l).get(sortedFood.get(k)));
                    }
                }

            }
        }
    }
}
