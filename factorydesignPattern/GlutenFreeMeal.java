package DesignPatterns.factorydesignPattern;

public class GlutenFreeMeal implements Meal {
    @Override
    public void mealType(){
        System.out.println("GlutenFreeMeal is ready.");
    }

}
