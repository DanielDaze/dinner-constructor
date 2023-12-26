package ru.practicum.dinner;

import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

public class DinnerConstructor {
    Random random = new Random();
    HashMap<String, ArrayList<String>> dishListByCategories = new HashMap<>();

    void addNewDish(String dishType, String dishName) {
        if (!this.checkType(dishType)) {
            ArrayList<String> newDishList = new ArrayList<>();
            dishListByCategories.put(dishType, newDishList);
            dishListByCategories.get(dishType).add(dishName);
        } else {
            dishListByCategories.get(dishType).add(dishName);
        }
        System.out.println("Добавили блюдо " + dishName + " к типу блюд " + dishType);
    }

    ArrayList<String> generateDishCombo(ArrayList<String> dishTypes) {
        ArrayList<String> currentCombo = new ArrayList<>();
        for (String dishType : dishTypes) {
            int randomNumber = random.nextInt(dishListByCategories.get(dishType).size());
            currentCombo.add(dishListByCategories.get(dishType).get(randomNumber));
        }
        return currentCombo;
    }

    boolean checkType(String dishType) {
        return dishListByCategories.containsKey(dishType);
    }

}