import java.util.ArrayList;
import java.util.List;

public class Onda {
    private int idOnda;
    private List<Balao> inimigos = new ArrayList<>();
    private float intervaloSpawn;

    //CONSTRUTOR
    public Onda(int idOnda, float intervaloSpawn) {
        this.idOnda = idOnda;
        this.intervaloSpawn = intervaloSpawn;
        this.inimigos = new ArrayList<>();
    }

    //ENCAPSULAMENTO
    public int getIdOnda(){return idOnda;}
    public void setIdOnda(int idOnda){
        this.idOnda = idOnda;
    }

    public List<Balao> getInimigos(){return inimigos;}
    public void setInimigos(List<Balao> inimigos){
        this.inimigos = inimigos;
    }

    public float getIntervaloSpawn(){return intervaloSpawn;}
    public void setIntervaloSpawn(float intervaloSpawn){
        this.intervaloSpawn = intervaloSpawn;
    }

    //MÉTODO
    public void prepararOnda(int quantidade, List<Coordenadas> caminho) {
        this.inimigos.clear(); // Limpa se houver algo antes
        for (int i = 0; i < quantidade; i++) {
            // Cria balões (id, hp, camuflado, blindado, enxame, caminho)
            Balao novoBalao = new Balao(i, 10, false, false, false, caminho);
            this.inimigos.add(novoBalao);
        }
    }
}
