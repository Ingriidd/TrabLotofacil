import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CadastroUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> usuarios = new ArrayList<>();

        System.out.println("Bem-vindo ao cadastro de usuários!");

        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Cadastrar novo usuário");
            System.out.println("2. Listar usuários cadastrados");
            System.out.println("3. Sortear letra de A-Z");
            System.out.println("4. Sortear número de 0 a 100");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o nome do usuário:");
                    String nome = scanner.nextLine();
                    usuarios.add(nome);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 2:
                    if (usuarios.isEmpty()) {
                        System.out.println("\nNenhum usuário cadastrado ainda.");
                    } else {
                        System.out.println("\nUsuários cadastrados:");
                        for (String usuario : usuarios) {
                            System.out.println(usuario);
                        }
                    }
                    break;
                case 3:
                    char letraSorteada = (char) ('A' + random.nextInt(26));
                    System.out.println("\nLetra sorteada: " + letraSorteada);
                    break;
                case 4:
                    int numeroSorteado = random.nextInt(101);
                    System.out.println("\nNúmero sorteado: " + numeroSorteado);
                    break;
                case 5:
                    System.out.println("\nSaindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }
}
