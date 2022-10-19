// Criando a classe Cidade como programa Principal
public class Cidade {
    private static Cliente pizzariaDois;
    private static Cliente pizzariaTres;

    public static void main(String[] args) {
        // Instanciando os Clientes no sistema
        Cliente clienteUm = new Cliente("Kelvin Ray", "406.565.420-39", "27/10/2001", "(47) 2514-5227");
        Cliente clienteDois = new Cliente("Júlio Martins", "168.030.656-18", "13/08/2009", "(67) 6037-6726");
        Cliente clienteTres = new Cliente("Murilo Rodrigues", "465.494.817-16", "(21) 3666-8319", "(21) 3666-8319");

        // Instanciando os Chefs no sistema
        Chef chefUm = new Chef("Maria Eduarda", "392.328.560-42", "10/04/2002");
        Chef chefDois = new Chef("Maria Santos", "977.065.990-86", "06/04/2002");
        Chef chefTres = new Chef("Matheus Pontes", "633.713.610-12", "08/01/1999");

        // Instanciando as Pizzaria no sistema
        Pizzaria pizzariaUm = new Pizzaria();
        Pizzaria pizzariaDois = new Pizzaria();
        Pizzaria pizzariaTres = new Pizzaria();

        // Instanciando as Receitas com seus determinados Chefs no sistema
        Sabor pizzaUm = new Sabor("Calabresa", "preparar a massa e assar");
        Sabor pizzaDois = new Sabor("Quatro Queijo", "Preparar a massa e assar");
        Sabor pizzaTres = new Sabor("Frango com Catupiry", "preparar a massa e assar");
        Sabor pizzaQuatro = new Sabor("Pizza de Coco com chocolate", "preparar a massa e assar");
        Sabor pizzaCinco = new Sabor("Pizza Portuguesa", "preparar a massa e assar");
        Sabor pizzaSeis = new Sabor("Pizza Broclis com bacon",
                "Separar todos os ingredientes,preparar a massa e assar");
        Sabor pizzaSete = new Sabor("Pizza Marguerita", "Separar os ingredientes preparalos e assar");
        Sabor pizzaOito = new Sabor("Pizza de frango", "Separar os ingredientes,prepara-los e fazer a Pizza");
        Sabor pizzaNove = new Sabor("Pizza de Carne", "Separar os ingredientes,prepara-los, assar a massa");
        Sabor pizzaDez = new Sabor("Pizza de carne", "Separar os ingredientes,prepara-los e fazer a Pizza");

        // Adicionando as Receitas na Pizzaria 1
        pizzariaUm.setSabor(pizzaCinco);
        pizzariaUm.setSabor(pizzaDez);
        pizzariaUm.setSabor(pizzaSeis);
        pizzariaUm.setSabor(pizzaSete);
        pizzariaUm.setSabor(pizzaUm);

        // Adicionando as Receitas na Pizzaria 2
        pizzariaDois.setSabor(pizzaOito);
        pizzariaDois.setSabor(pizzaNove);
        pizzariaDois.setSabor(pizzaQuatro);
        pizzariaDois.setSabor(pizzaTres);
        pizzariaDois.setSabor(pizzaUm);

        // Adicionando as Receitas na Pizzaria 3
        pizzariaTres.setSabor(pizzaOito);
        pizzariaTres.setSabor(pizzaNove);
        pizzariaTres.setSabor(pizzaQuatro);
        pizzariaTres.setSabor(pizzaTres);
        pizzariaTres.setSabor(pizzaUm);

        // Adicionando as Receitas compradas pelo Cliente 1
        clienteUm.setSabor(pizzaCinco);
        clienteUm.setSabor(pizzaDez);
        clienteUm.setSabor(pizzaSeis);
        clienteUm.setSabor(pizzaSete);
        clienteUm.setSabor(pizzaUm);

        // Adicionando as Receitas compradas pelo Cliente 2
        clienteDois.setSabor(pizzaUm);
        clienteDois.setSabor(pizzaCinco);
        clienteDois.setSabor(pizzaDois);
        clienteDois.setSabor(pizzaTres);
        clienteDois.setSabor(pizzaUm);

        // Adicionando as Receitas compradas pelo Cliente 3
        clienteTres.setSabor(pizzaOito);
        clienteTres.setSabor(pizzaNove);
        clienteTres.setSabor(pizzaQuatro);
        clienteTres.setSabor(pizzaTres);
        clienteTres.setSabor(pizzaDois);

        System.out.println(pizzariaUm.toString());
        System.out.println(pizzaDois.toString());
        System.out.println(pizzaTres.toString());

        System.out.println("\n");
        // Dados dos Clientes 1,2 e 3 usando o método toString a apartir padrão de
        // projeto Decorator

        System.out.println(clienteUm.toString());
        System.out.println(clienteDois.toString());
        System.out.println(clienteTres.toString());

        System.out.println("\n");
        // Dados dos Chefs 1,2 e 3 usando o método toString a apartir padrão de projeto
        // Decorator

        System.out.println(chefUm.toString());
        System.out.println(chefDois.toString());
        System.out.println(chefTres.toString());

        System.out.println("\n");
        // Dados das receitas 1 até a 10 usando o método toString a apartir padrão de
        // projeto Decorator
        System.out.println(pizzaUm.toString());
        System.out.println(pizzaDois.toString());
        System.out.println(pizzaTres.toString());
        System.out.println(pizzaQuatro.toString());
        System.out.println(pizzaCinco.toString());
        System.out.println(pizzaSeis.toString());
        System.out.println(pizzaSete.toString());
        System.out.println(pizzaOito.toString());
        System.out.println(pizzaNove.toString());
        System.out.println(pizzaDez.toString());
    }
}