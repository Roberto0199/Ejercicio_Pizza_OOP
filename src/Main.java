import Hijo.PizzaItaliana;
import Hijo.Topping;
import Padre.Pizza;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> ingredientesPizza = new ArrayList<>();
        ingredientesPizza.add("queso");
        ingredientesPizza.add("tomate");
        ingredientesPizza.add("cebolla");

        Pizza miPizza = new Pizza("Pizza clásica", 69.99, ingredientesPizza);
        miPizza.preparar();
        System.out.println(miPizza);

        System.out.println();

        PizzaItaliana miPizzaItaliana = new PizzaItaliana("Pizza italiana", 84.99, ingredientesPizza, "tomate", 15);
        miPizzaItaliana.preparar();
        System.out.println(miPizzaItaliana);

        System.out.println();

        Topping quesoExtra = new Topping("queso extra");
        quesoExtra.agregar(miPizza);

        Topping champinones = new Topping("champiñones");
        champinones.agregar(miPizzaItaliana);
    }
}

