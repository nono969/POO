public class Fitas_de_video {

    private String Titulo;
    private int Diaria;

    public Fitas_de_video(String Titulo, int Diaria) {
        this.Titulo = Titulo;
        this.Diaria = Diaria;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getDiaria() {
        return Diaria;
    }

    public int getValorAluguel(int DiasAlugados) {
        return Diaria * DiasAlugados;
    }

    public String toString() {
        return "Titulo: " + Titulo + ", Diaria: R$" + Diaria;
    }
}