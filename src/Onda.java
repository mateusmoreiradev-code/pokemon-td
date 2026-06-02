import java.util.ArrayList;
import java.util.List;

public class Onda {
    private int idOnda;
    private List<Balao> inimigos = new ArrayList<>();
    private float intervaloSpawn;

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
}
