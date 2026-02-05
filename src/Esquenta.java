import java.util.Scanner;

public class Esquenta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Inteiros
        byte b = 121;
        System.out.println("byte: "+ b);

        short s = - 30000;
        System.out.println("Short: " + s);

        int i = 7;
        System.out.println("Int: "+ i);


        long l = 500000000;
        System.out.println("Long: " + l);

        //Pontos Flutuantes
        float f = 400;
        System.out.println("Float: " + f);

        double d = 2.99;
        System.out.println("Double: " + d);


        //Caractere
        char c = 'y';
        System.out.println("Char: " + c);

        //Lógico
        boolean bo = true;
        System.out.println("Boolean: " + bo);
    }
}