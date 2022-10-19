import java.util.ArrayList;

public class Comanda extends Generic {

    private int numero;
    private String data;
    private String Cliente;
    private Cliente cliente;
    ArrayList<Pizza> pizzas;
    private int idChef;

    private Chef chef;

    public static ArrayList<Comanda> comandas = new ArrayList<>();

    public Comanda(
            int numero,
            String data,
            Cliente cliente,
            Chef chef) {
        this.setId(this.getNextId());
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.cliente = cliente;
        this.pizzas = new ArrayList<>();
        this.chef = chef;
        comandas.add(this);
        cliente.comandas.add(this);
    }

    private int getNextId() {
        int id = 0;

        for (Comanda comanda : comandas) {
            if (comanda.getId() > id) {
                id = comanda.getId();
            }
        }

        return id + 1;

    }

    public String getnumero() {
        return null;
    }

    public String getdata() {
        return null;
    }

    public static ArrayList<Comanda> getComandas() {
        return comandas;
    }

    public void setnumero(int numero2) {
        this.numero = numero2;
    }

    public void setData(String numero2) {
        this.data = numero2;
    }

    @Override
    public String toString() {
        return "Comanda numero: " + this.numero + "\n" + "Data Comanda" + this.data;
    }

    public static Comanda getComandaById(int numero2) throws Exception {
        for (Comanda comanda : comandas) {
            if (comanda.getId() == numero2) {
                return comanda;
            }
        }

        throw new Exception("Não há comanda");
    }

}
