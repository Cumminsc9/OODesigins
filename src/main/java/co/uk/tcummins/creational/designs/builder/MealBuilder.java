package co.uk.tcummins.creational.designs.builder;

/**
 * Created by Tom on 20/09/2016.
 */
public class MealBuilder
{

    public Meal prepareVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem( new VegBurger() );
        meal.addItem( new Coke() );
        return meal;
    }


    public Meal prepareNonVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem( new ChickenBurger() );
        meal.addItem( new Pepsi() );
        return meal;
    }
}
