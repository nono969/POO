public class PrincipalFita {
    public static void main(String[] args) {
        Fitas_de_video fita1 = new Fitas_de_video("Branca de Neve", 7);
        Fitas_de_video fita2 = new Fitas_de_video("Matrix", 3);
        Fitas_de_video fita3 = new Fitas_de_video("Barbie", 5);

        System.out.println(fita1);
        System.out.println("Valor por 3 dias: R$" + fita1.getValorAluguel(3));

        System.out.println(fita2);
        System.out.println("Valor por 2 dias: R$" + fita2.getValorAluguel(2));

        System.out.println(fita3);
        System.out.println("Valor por 5 dias: R$" + fita3.getValorAluguel(5));
    }
}
