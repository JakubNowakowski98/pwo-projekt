package pwo.products;

/**
 *
 * @author Jakub Nowakowski
 */
public class Products_template {

    public String name;
    public int weight;
    public int value;

    /**
     *
     * @param name = nazwa przedmiotu na promocji "Black Friday"
     * @param weight = "waga" przedmiotu do "plecaka"
     * @param value = wartość przedmiotu na promocji
     */
    public Products_template(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

}
