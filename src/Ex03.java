import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {


        String[] nome = {
                "Ana", "Bruno", "Carla", "Daniel", "Eduarda",
                "Felipe", "Gabriela", "Henrique", "Isabela", "João",
                "Kayra", "Lucas", "Marcos", "Núbia", "Olavo"
        };

        busca(nome);
    }

    public static void busca(String[] nome){

       Scanner sc = new Scanner(System.in);

        String alvo = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nome.length; i++) {
            if (nome[i].equalsIgnoreCase(alvo)) {
                System.out.println("Nome " + alvo + " encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O nome " + alvo + " não foi encontrado.");
        }
    }
}
