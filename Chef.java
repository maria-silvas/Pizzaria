import java.util.ArrayList;

public class Chef extends Pessoa {

    String idchefe;

    public static ArrayList<Chef> chefs = new ArrayList<>();

    public Chef(
            String nome,
            String cpf,
            String dataNascimento) {
        super(nome, cpf, dataNascimento);
        this.idchefe = this.getNextId();

        chefs.add(this);
    }

    private String getNextId() {
        return null;
    }

}
