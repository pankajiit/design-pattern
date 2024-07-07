package DesignPatterns.factorydesignPattern;

public class NonVaganMeal implements Meal {
    @Override
    public void mealType(){
        System.out.println("Non vagan meal is ready.");
    }
}
