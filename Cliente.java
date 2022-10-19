import java.util.ArrayList;

public class Cliente extends Pessoa {

    
    public ArrayList<Comanda> comandas;
    private int idcliente;
    public String telefone;
    public String endereco;

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente(
            String nome,
            String cpf,
            String telefone,
            String endereco,
            String dataNascimento) {
            super(nome,cpf,dataNascimento);
        
        this.telefone=telefone;
        this.endereco=endereco;

        this.setIdcliente(this.getNextId());
        
        this.comandas = new ArrayList<>();

        clientes.add(this);
    }

    private void setIdcliente(int nextId) {
    }

    public static Cliente verificarId(int id) throws Exception {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        throw new Exception("Cliente não existe");
    }


    public int getId() {
        return 0;
    }

    private int getNextId() {
        int id = 0;

        for (Cliente cliente : clientes) {
            if (cliente.getId() > id) {
                id = cliente.getId();
            }
        }

        return id + 1;

    }

    public String getnome() {
        return null;
    }

    @Override
    public String toString() {
        return "Id: " + super.getId() + "\n"
                + super.getNome()+ "\n"
                + super.getCPF()+ "\n"
                + this.telefone+ "\n"
                + this.endereco+ "\n";
    }

    private int getEndereço() {
        return 0;
    }

    public void setSabor(Sabor pizzariatres) {
    }

}