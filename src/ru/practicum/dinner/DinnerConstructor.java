package ru.practicum.dinner;

import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

public class DinnerConstructor {
    Random random = new Random();
    HashMap<String, ArrayList<String>> dinnerCombo = new HashMap<>();

    void addNewDish(String dishType, String dishName) {
        if (!dinnerCombo.containsKey(dishType)) {
            ArrayList<String> categoryDishList = new ArrayList<>();
            dinnerCombo.put(dishType, categoryDishList);
            dinnerCombo.get(dishType).add(dishName);
        } else {
            dinnerCombo.get(dishType).add(dishName);
        }
        System.out.println("Добавили блюдо  " + dishName + " к типу блюд " + dishType);
    }


    void generateDishCombo(int numberOfCombos, String nextItem) {

    }
}