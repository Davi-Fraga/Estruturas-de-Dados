
public class Esquenta {
    public static void main(String[] args) {

        imprimirTiposPrimitivos();
    }

    public static void imprimirTiposPrimitivos() {
        //Inteiros
        byte b = 121;
        System.out.println("byte: "+ b);

        short s = - 30000;
        System.out.println("short: " + s);

        int i = 7;
        System.out.println("int: "+ i);


        long l = 500000000;
        System.out.println("long: " + l);

        //Pontos Flutuantes
        float f = 400;
        System.out.println("float: " + f);

        double d = 2.99;
        System.out.println("double: " + d);


        //Caractere
        char c = 'y';
        System.out.println("char: " + c);

        //Lógico
        boolean bo = true;
        System.out.println("boolean: " + bo);
    }
}