public class Mapa {
    private int idMapa;
    private int largura;
    private int altura;
    private int[][] layout;

    public Mapa(int idMapa, int largura, int altura){
        this.idMapa = idMapa;
        this.largura = largura;
        this.altura = altura;
        this.layout = new int[largura][altura];
    }

    public int getIdMapa(){return idMapa;}
    public void setIdMapa(int idMapa){
        this.idMapa = idMapa;
    }

    public int getLargura(){return largura;}
    public void setLargura(int largura){
        this.largura = largura;
    }

    public int getAltura(){return altura;}
    public void setAltura(int altura){
        this.altura = altura;
    }

    public int[][] getLayout(){return layout;}
    public void setLayout(int[][] layout){
        this.layout = layout;
    }
}
