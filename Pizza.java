import java.util.ArrayList;

public class Pizza extends Generic {

    public String tamanho;
    public int idSabor;
    public Sabor sabor;
    public int idComanda;
    public Comanda comanda;

    public static ArrayList<Pizza> pizzas = new ArrayList<>();

    public Pizza(
            String tamanho,
            Sabor sabor,
            Comanda comanda) {
        this.setId(this.getNextId());
        this.tamanho = tamanho;
        this.idSabor = sabor.getId();
        this.sabor = sabor;
        this.idComanda = comanda.getId();
        this.comanda = comanda;

        pizzas.add(this);
        comanda.pizzas.add(this);
        sabor.pizzas.add(this);
    }

    private int getNextId() {
        int id = 0;

        for (Pizza pizza : pizzas) {
            if (pizza.getId() > id) {
                id = pizza.getId();
            }
        }

        return id + 1;

    }
}