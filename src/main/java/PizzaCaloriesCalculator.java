public class PizzaCaloriesCalculator {
    public static int calculateCalories(int diameter, int calories) {
        double area = Math.PI * Math.pow(diameter / 2, 2);
        int caloriesTotal = (int) (area * calories);

        return caloriesTotal;
    }
}