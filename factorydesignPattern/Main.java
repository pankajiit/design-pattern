package DesignPatterns.factorydesignPattern;

public class Main {

    public static void main(String[] args) {
        
        MealFactory mealFactory = new MealFactory();

       Meal vaganMeal =  mealFactory.getFood("VaganMeal");
       vaganMeal.mealType();

       Meal nonVaganMeal = mealFactory.getFood("NonVaganMeal");
       nonVaganMeal.mealType();

       Meal glutenFreeMeal = mealFactory.getFood("FreeMeal");
       glutenFreeMeal.mealType();

    }

    
}
