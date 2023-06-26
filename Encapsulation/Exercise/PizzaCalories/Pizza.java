package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private final int maxToppings = 10;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }
    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (!name.trim().isEmpty() && name.length() <= 15) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings > 10 || numberOfToppings < 1){
           throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>();
    }
    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }
    public double getOverallCalories (){
        double toppingCalories = 0;
        for (Topping topping:this.toppings) {
            toppingCalories += topping.calculateCalories();
        }
        return this.dough.calculateCalories() + toppingCalories;
    }
}
