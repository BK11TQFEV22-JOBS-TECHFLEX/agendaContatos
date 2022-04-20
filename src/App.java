import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();
        int opcao;
        do {
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Digite o nome do contato");
                    String nome = scanner.next();
                    System.out.println("Digite o sobrenome do contato");
                    String sobrenome = scanner.next();
                    System.out.println("Digite o telefone do contato");
                    String telefone = scanner.next();

                    Contato contato = new Contato(nome, sobrenome, telefone);
                    contatos.add(contato);
                    System.out.println("Contato adicionado!");

                    break;
                }
                case 2: {
                    System.out.println("Listagem de contatos:");
                    for (Contato contato: contatos) {
                        System.out.println(contato);
                    }

                    break;
                }
                case 3: {
                    System.out.println("Saindo do sistema...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");
                    break;
                }
            }

        } while (opcao != 3 );

        scanner.close();
    }
}
