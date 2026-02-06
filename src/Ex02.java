
public class Ex02 {
    public static void main(String[] args) {

        String[] nome = {
                "Ana", "Bruno", "Carla", "Daniel", "Eduarda",
                "Felipe", "Gabriela", "Henrique", "Isabela", "João",
                "Kayra", "Lucas", "Marcos", "Núbia", "Olavo"
        };

        System.out.println("Lista de Nomes");
        for (int i = 0 ; i < nome.length; i++){
            System.out.println((i+1) +" - "+ nome[i]);

        }

    }
}
