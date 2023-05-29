public class Main {
    public static void main(String[] args) {
        PizzaCaloriesCalculator caloriesCalculator = new PizzaCaloriesCalculator();
        int calories = 40;
        int diameterBigPizza = 28;
        int diameterSmallPizza = 24;
        int caloriesBigPizza = caloriesCalculator.calculateCalories(diameterBigPizza, calories);
        int caloriesSmallPizza = caloriesCalculator.calculateCalories(diameterSmallPizza, calories);

        int extraCalories = caloriesBigPizza - caloriesSmallPizza;
        System.out.println("При замене пиццы диаметром 24 см на пиццу диаметром 28 см");
        System.out.println("Лишних калорий будет съедено: " + extraCalories);
    }
}