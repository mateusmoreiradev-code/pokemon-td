import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private int idMapa;
    private String nomeMapa;
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

    // CONSTRUTOR
    public Mapa(int idMapa, String nomeMapa, int largura, int altura, int[][] layout){
        this.idMapa = idMapa;
        this.nomeMapa = nomeMapa;
        this.largura = largura;
        this.altura = altura;
        this.layout = layout;
    }

    // ENCAPSULAMENTO
    public int getIdMapa(){return idMapa;}
    public void setIdMapa(int idMapa){
        this.idMapa = idMapa;
    }

    public String getNomeMapa(){return nomeMapa;}
    public void setNomeMapa(String nomeMapa){ this.nomeMapa = nomeMapa;}

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

    //MÉTODOS
    public boolean verificaTerreno(Mapa mapa, int x, int y, Pokemon pokemon){
        if(x >= mapa.getLargura() || x < 0 || y >= mapa.getAltura() || y < 0){
            System.out.println("Posição fora dos limites do mapa!");
            return false;
        }

        int terrenoAtual = this.layout[x][y];

        if(terrenoAtual == parede || terrenoAtual == trilha || terrenoAtual == inicio || terrenoAtual == fim){
            System.out.println("Posição inválida!");
            return false;
        }

        switch (pokemon.getTipoPokemon()){
            case ÁGUA:
                return terrenoAtual == Mapa.terra || terrenoAtual == Mapa.agua;
            case FOGO:
                return terrenoAtual == Mapa.terra || terrenoAtual == Mapa.lava;
            case VOADOR:
                return terrenoAtual == Mapa.terra || terrenoAtual == Mapa.agua || terrenoAtual == Mapa.lava;
            default:
                return terrenoAtual == Mapa.terra;
        }
    };

    public List<Coordenadas> gerarCaminho(){
        List<Coordenadas> caminho = new ArrayList<>();

        Coordenadas trilhaAtual = setarInicio(inicio);
        if(trilhaAtual == null) return caminho;

        caminho.add(trilhaAtual);
        boolean[][] visitado = new boolean[largura][altura];
        visitado[trilhaAtual.x][trilhaAtual.y] = true;

        boolean andando = true;
        while(andando){
            Coordenadas trilhaSeguinte = buscarProximaCoordenada(trilhaAtual.x, trilhaAtual.y, visitado);
            if (trilhaSeguinte != null){
                caminho.add(trilhaSeguinte);
                visitado[trilhaSeguinte.x][trilhaSeguinte.y] = true;
                trilhaAtual = trilhaSeguinte;

                if(layout[trilhaAtual.x][trilhaAtual.y] == fim){
                    andando = false;
                }
            } else {
                andando = false;
            }
        }
        return caminho;
    }

    public Coordenadas setarInicio(int posicao){
        for(int y = 0; y < altura; y++){
            for(int x = 0; x < largura; x++){
                if (layout[x][y] == posicao) return new Coordenadas(x, y);
            }
        }
        return null;
    }

    private Coordenadas buscarProximaCoordenada(int cx, int cy, boolean[][] visitado){
        // cx = coordenada x | cy = coordenada y | nx = nova x | ny = nova y
        int[][] direcoes = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int[] direcao : direcoes){
            int nx = cx + direcao[0];
            int ny = cy + direcao[1];
            if (nx >= 0 && nx < largura && ny >= 0 && ny < altura){
                int terreno = layout[nx][ny];

                if ((terreno == trilha || terreno == fim) && !visitado[ny][nx]) {
                    return new Coordenadas(nx, ny);
                }
            }
        }
        return null;
    }

    //INSTANCIAMENTO PARA PASSAR PARA O MAIN FUTURAMENTE
    public static Mapa mapa1 = new Mapa(1, "Cidade de Pallet", 20, 15, new int[][] {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1},
        {1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1},
        {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1},
        {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1},
        {9, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 8, 1},
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    });
}
