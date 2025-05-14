public class Calendario{

    private int dia;
    private int mes;
    private int ano;

    public Calendario(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String nomeMes(int m){
        switch (m){
            case 1: return "janeiro";
            case 2: return "fevereiro";
            case 3: return "março";
            case 4: return "abril";
            case 5: return "maio";
            case 6: return "junho";
            case 7: return "julho";
            case 8: return "agosto";
            case 9: return "setembro";
            case 10: return "outubro";
            case 11: return "novembro";
            case 12: return "dezembro";
            default: return "mes invalido";
        }
    }

    public void mostraData(){
        System.out.println(dia + " de " + nomeMes(mes) + " de " + ano);
    }
    public void anoBissexto(){
        if(ano % 4 == 0){
            System.out.println(" o ano " + ano + " é bissexto seu infeliz! ");
        }
    }
}