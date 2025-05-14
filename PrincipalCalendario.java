public class PrincipalCalendario{
    public static void main(String[] args){


        Calendario data1 = new
        Calendario(7, 5, 2024);
        Calendario data2 = new
        Calendario(25, 12, 2023);
    
        System.out.println("data 1: ");
        data1.mostraData();
        data1.anoBissexto();
    
        System.out.println("\nData 2: ");
        data2.mostraData();
        data2.anoBissexto();

    }
}