package EXAMS.E07.restaurant.entities.healthyFoods;

public class VeganBiscuits extends Food {
    private static final double INITIAL_SALAD_PORTION = 205;

    public VeganBiscuits(String name, double price) {
        super(name, INITIAL_SALAD_PORTION, price);
    }
}
