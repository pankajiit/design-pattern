package DesignPatterns.factorydesignPattern;

public class MealFactory {

    public static Meal getFood(String foodTypeName){
        switch (foodTypeName.toUpperCase()) {
            
            case "VAGANMEAL":
                return new VaganMeal();
                
        
            case "NONVAGANMEAL":
                return new NonVaganMeal();
                

            case "GLUTENFREEMEAL" :
                return new GlutenFreeMeal(); 
            
            case "KETO":
                return new KetoMeal();
            
            default:
                System.out.println("Non meal is selected");
                throw new IllegalArgumentException("Unknown meal type: " + foodTypeName);
                     
        }

    }
    
}
