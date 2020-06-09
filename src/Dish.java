public class Dish {
//    -- OOP SHORT ASSIGNMENT #1 --
//    Create a class called Dish. This class will represent various restaurant dishes.
//    Include an integer property called "costInCents"
//    Include a string property called "nameOfDish"
//    Include a boolean property called "wouldRecommend"
//    Include a method called "printSummary" with a void return type
//    this method will use a single printf method to print out the values of each of the instance properties in the following format:
//    Cost: COST_IN_CENTS_HERE
//    Name: NAME_OF_DISH_HERE
//    Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("Cost: " + costInCents);
        System.out.printf("Name: " + nameOfDish);
        System.out.printf("Recommended: " + wouldRecommend);
    }

//- SHORT ASSIGNMENT #2 --
//    PART 1
//    Refactor your Dish and DishTest classes...
//            1) Change all properties in the Dish class to private visibility (printSummary should remain public)
//      2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
//      3) Refactor code as needed in DishTest to access and modify dish object property values
//      4) Add a constructor method to Dish that will assign all properties
//      5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
//    PART 2
//    Create a class of static fields (properties and methods) called DishTools
//      - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000
//            - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//      - analyzeDishCost() - that takes in a Dish object and will print out either "More expensive than average" or "Less expensive than average", depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//      - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//    Try out the DishTools methods with Dish objects in the DishTest main method
//

}
