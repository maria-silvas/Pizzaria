import java.util.ArrayList;

public class Sabor extends Generic {

    public String descricao;
    public String detalhamento;
    public ArrayList<Pizza> pizzas;

    public static ArrayList<Sabor> sabores = new ArrayList<>();

    public Sabor(
            String descricao,
            String detalhamento, String string, int i, String string2, Chef chefum) {
        this.setId(this.getNextId());
        this.descricao = descricao;
        this.detalhamento = detalhamento;
        this.pizzas = new ArrayList<>();

        sabores.add(this);
    }

    public Sabor(String descricao2, String detalhamento2) {
    }

    public static Sabor verificarId(int id) throws Exception {
        for (Sabor sabor : sabores) {
            if (sabor.getId() == id) {
                return sabor;
            }
        }
        throw new Exception("Sabor não existe");
    }

    private int getNextId() {
        int id = 0;

        for (Sabor sabor : sabores) {
            if (sabor.getId() > id) {
                id = sabor.getId();
            }
        }

        return id + 1;

    }

    public String getdescricao() {
        return null;
    }

    public String getdetalhamento() {
        return null;
    }

    public void decricao(String numero3) {

        this.descricao = numero3;
    }

    public void setdetalhamento(String numero3) {

        this.descricao = numero3;
    }

    @Override
    public String toString() {
        return "Sabor: " + this.descricao + "\n" + "Detalhamento" + this.detalhamento;
    }

}
