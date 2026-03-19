import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> lista = new ArrayList<>();
        lista.add(new Leao("Simba | Leão", 5));
        lista.add(new Canguru("Jack | Canguru", 3));
        lista.add(new Peixe("Peixe espada", 1));
        lista.add(new Ave("Blue | arara", 2));
        lista.add(new Mamifero("Chico | chimpanzé", 0.4));
        lista.add(new Reptil("Sucuri amarela", 2));

        int opcao = 0;

        while (opcao != 6) {

            System.out.println("\n=== ZOOLÓGICO DE BH ===");
            System.out.println("1 - Listar animais");
            System.out.println("2 - Alimentar animal");
            System.out.println("3 - Emitir som");
            System.out.println("4 - Idade dos animais");
            System.out.println("5 - Fazer o animal correr");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + " - " + lista.get(i).getNome());
                    }
                    break;

                case 2:
                    System.out.print("Digite o número do animal: ");
                    int a = sc.nextInt();
                    if (a >= 0 && a < lista.size()) {
                        lista.get(a).alimentar();
                    } else {
                        System.out.println("Animal inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o número do animal: ");
                    int b = sc.nextInt();
                    if (b >= 0 && b < lista.size()) {
                        lista.get(b).emitirSom();
                    } else {
                        System.out.println("Animal inválido.");
                    }
                    break;

                case 4:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i).getNome() + " | " + lista.get(i).getIdade() + " anos");
                    }
                    break;

                case 5:
                    System.out.print("Digite o número do animal: ");
                    int c = sc.nextInt();
                    if (c >= 0 && c < lista.size()) {
                        lista.get(c).locomover();
                    } else {
                        System.out.println("Animal inválido.");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}