public class Ex01 {
    public static void main(String[] args) {

        String a = " Ana";
        System.out.println(a);
        String b = " Bruno";
        System.out.println(b);
        String c = " Carla";
        System.out.println(c);
        String d = " Davi";
        System.out.println(d);
        String e = " Eduardo";
        System.out.println(e);
        String f = " Felipe";
        System.out.println(f);
        String g = " Gabriel";
        System.out.println(g);
        String h = " Henrique";
        System.out.println(h);
        String i = " Isa";
        System.out.println(i);
        String j = " João";
        System.out.println(j);



        String[] nomes = {
                "Ana", "Bruno", "Carla", "Daniel", "Eduarda",
                "Felipe", "Gabriela", "Henrique", "Isabela", "João"
        };


        System.out.println("Lista de Nomes");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
