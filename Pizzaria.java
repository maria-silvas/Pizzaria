import java.util.Scanner;

public class Pizzaria {
    private static Cliente cliente;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("==================================");
            System.out.println("==========PIZZARIA===========");
            System.out.println("==================================");

            System.out.println("Digite a operação do menu: ");
            System.out.println("01 - Cadastrar Cliente");
            System.out.println("02 - Listar Clientes");
            System.out.println("03 - Cadastrar Sabor");
            System.out.println("04 - Listar Sabores");
            System.out.println("05 - Cadastrar Comanda");
            System.out.println("06 - Listar Comandas");
            System.out.println("07 - Quantidade Pizzas por Tamanho");
            System.out.println("08 - Excluir Comanda");
            System.out.println("09- Alterar Comanda");
            System.out.println("10 - Sair");

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        cadastrarCliente(scanner);
                        break;
                    case 2:
                        listarClientes();
                        break;
                    case 3:
                        cadastrarSabor(scanner);
                        break;
                    case 4:
                        listarSabores();
                        break;
                    case 5:
                        cadastrarComanda(scanner);
                        break;
                    case 6:
                        listarComandas();
                        break;
                    case 7:
                        quantidadePizzasPorTamanho();
                        break;

                    case 8:
                        ExcluirComanda();
                        break;

                    case 9:
                        AlterarComanda();
                        break;

                    case 10:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                opcao = 10;
            }

        } while (opcao != 0);
        scanner.close();
    }

    private static void AlterarComanda() {
    }

    private static void ExcluirComanda() {
    }

    public static void cadastrarCliente(Scanner scanner) {
        try {
            System.out.println("Digite o nome do cliente: ");
            String nome = scanner.next();
            System.out.println("Digite o CPF do cliente: ");
            String cpf = scanner.next();
            System.out.println("Digite o telefone do cliente: ");
            String telefone = scanner.next();
            System.out.println("Digite o endereço do cliente: ");
            String endereco = scanner.next();
            System.out.println("Digite a data de Nascimento: ");
            String dataNasciemnto = scanner.next();

            new Cliente(nome, cpf, telefone,endereco,dataNasciemnto);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar cliente!");
        }
    }

    public static void listarClientes() {
        for (Cliente cliente : Cliente.clientes) {
            System.out.println(
                    "Id: " + cliente.getId() + "\n"
                            + "Nome: " + cliente.nome + "\n"
                            + "CPF: " + cliente.cpf + "\n"
                            + "Telefone: " + cliente.telefone + "\n"
                            + "Endereço: " + cliente.endereco + "\n");
            System.out.println(cliente);
        }
    }

    public static void cadastrarSabor(Scanner scanner) {
        try {
            System.out.println("Digite a descrição do sabor: ");
            String descricao = scanner.next();
            System.out.println("Digite o detalhamento do sabor: ");
            String detalhamento = scanner.next();

            new Sabor(descricao, detalhamento);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar sabor!");
        }
    }

    public static void listarSabores() {
        for (Sabor sabor : Sabor.sabores) {
            System.out.println(
                    "Id: " + sabor.getId() + "\n"
                            + "Descrição: " + sabor.descricao + "\n"
                            + "Detalhamento: " + sabor.detalhamento + "\n");
            System.out.println(sabor);
        }
    }

    public static void cadastrarComanda(Scanner scanner) {
        try {
            System.out.println("Digite o ID do cliente: ");
            int idCliente = scanner.nextInt();
            System.out.println("Digite o numero da comanda: ");
            int numero = scanner.nextInt();
            System.out.println("Digite a data da comanda: ");
            String data = scanner.next();

            Comanda comanda = new Comanda(numero, data, Cliente.verificarId(idCliente), null);

            System.out.println("Digite a quantidade pizzas: ");
            int quantidade = scanner.nextInt();

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite o tamanho da pizza: ");
                String tamanho = scanner.next();
                switch (tamanho) {
                    case "P":
                        tamanho = "Pequena";
                        break;
                    case "M":
                        tamanho = "Média";
                        break;
                    case "G":
                        tamanho = "Grande";
                        break;
                    default:
                        throw new Exception("Tamanho inválido!");
                }
                System.out.println("Digite o ID do sabor: ");
                int idSabor = scanner.nextInt();

                new Pizza(tamanho, Sabor.verificarId(idSabor), comanda);
            }

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar comanda!");
        }
    }

    public static void listarComandas() {
        for (Comanda comanda : Comanda.comandas) {
            System.out.println(
                    "Id: " + comanda.getId() + "\n"
                            + "Numero: " + comanda.getnumero() + "\n"
                            + "Data: " + comanda.getdata() + "\n"
                            + "Cliente: " + cliente.getnome() + "\n");

            for (Pizza pizza : Pizza.pizzas) {
                if (pizza.comanda.getId() == comanda.getId()) {
                    System.out.println(
                            "  Id Pizza: " + pizza.getId() + "\n"
                                    + " Tamanho: " + pizza.tamanho + "\n"
                                    + " Sabor: " + pizza.sabor.descricao + "\n");
                }
            }
        }
    }

    public static void quantidadePizzasPorTamanho() {
        String[] tamanhos = new String[] {
                "Pequena",
                "Média",
                "Grande"
        };
        int[] quantidades = new int[tamanhos.length];

        for (int i = 0; i < tamanhos.length; i++) {
            for (Pizza pizza : Pizza.pizzas) {
                if (pizza.tamanho.equals(tamanhos[i])) {
                    quantidades[i]++;
                }
            }
        }

        for (int i = 0; i < quantidades.length; i++) {
            System.out.println(
                    "Tamanho: " + tamanhos[i] + "\n"
                            + "Quantidade: " + quantidades[i] + "\n");
        }
    }

    public static void AlterarComanada(Scanner sc) {
        System.out.println("==== Alterar Comanda ====");
        System.out.println("Informe o ID do Comanda a ser alterado: ");
        int id = sc.nextInt();

        try {
            Comanda comanda2 = Comanda.getComandaById(id);

            if (comanda2 instanceof Comanda) {
                System.out.println("Informe o elemento a ser alterado: ");
                System.out.println("1 - Numero");
                System.out.println("2 - Data");

                int opcao = sc.nextInt();
                switch (opcao) {
                    case 1:

                        System.out.println("Informe o novo numero ");
                        int novonumero = sc.nextInt();
                        comanda2.setnumero(novonumero);
                        break;

                    case 2:
                        System.out.println("Informe o  novo numero da comanda: ");
                        int novonumero2 = sc.nextInt();
                        comanda2.setnumero(novonumero2);
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("Comanda não encontrada :");
        }
    }

    public static void ExcluirComanda(Scanner sc) {
        System.out.println("==== Excluir Comanda ====");
        System.out.println("Informe o ID do Comanda a ser excluído: ");
        int numero = sc.nextInt();

        try {
            Comanda comanda = Comanda.getComandaById(numero);
            System.out.println("Comanda " + comanda.getnumero() + " excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Comanda não encontrada!");
        }
    }

    public void setSabor(Sabor pizzaseis) {
    }
}
