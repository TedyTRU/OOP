package OOP.EX24_DESIGN_PATTERNS.E01_Factory_Pattern;

public class Pizzeria {

    private PizzaFactory pizzaFactory;

    public Pizzeria(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaType type, int diameter) {
        Pizza pizza = pizzaFactory.createPizza(type, diameter);
        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }

}
