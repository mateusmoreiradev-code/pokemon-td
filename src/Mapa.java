public class Mapa {
    public int idMapa;
    public int largura;
    public int altura;
    public int[][] layout;

    public Mapa(int idMapa, int largura, int altura){
        this.idMapa = idMapa;
        this.largura = largura;
        this.altura = altura;
        this.layout = new int[largura][altura];
    }
}
