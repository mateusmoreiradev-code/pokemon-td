public class Mapa {
    private int idMapa;
    private int largura;
    private int altura;
    private int[][] layout;

    public static final int trilha = 0;
    public static final int terra = 1;
    public static final int agua = 2;
    public static final int parede = 3;
    public static final int lava = 4;

    public static final int fim = 8;
    public static final int inicio = 9;

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
