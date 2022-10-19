public class Endereco {
    String id;
    String cep;
    String rua;
    int numero;
    String bairro;
    String cidade;
    Pizzaria pizza;

    public Endereco(

            String id,
            String cep,
            String rua,
            int numero,
            String bairro,
            String cidade,
            Pizzaria pizzaria

    ) {
        this.id = id;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pizza = pizzaria;
    }

    public Endereco(String cidade2, String bairro2, String cep2, String rua2, int numero2,
            Estabelecimento estabelecimento) {
    }

    public String getCidade() {
        return null;
    }

    public String getBairro() {
        return null;
    }

    public String getNumero() {
        return null;
    }

    public String getRua() {
        return null;
    }

    public String setCidade(String cidade) {
        return this.cidade = cidade;
    }

    public String setBairro(String bairro) {
        return this.bairro = bairro;
    }

    public int setNumero(int numero) {
        return this.numero = numero;
    }

    public String setRua(String rua) {
        return this.rua = rua;
    }
}