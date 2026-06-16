import java.util.ArrayList;
import java.util.List;

public class
Fase {
    private int idFase;
    private Mapa mapa;
    private List<Onda> ondas = new ArrayList<>();
    private int recompensa;
    private Dificuldade dificuldade;

    public Fase(int idFase, Mapa mapa, List<Onda> ondas, int recompensa, Dificuldade dificuldade){
        this.idFase = idFase;
        this.mapa = mapa;
        this.ondas = ondas;
        this.recompensa = recompensa;
        this.dificuldade = dificuldade;
    }

    public int getIdFase(){return idFase;}
    public void setIdFase(int idFase){
        this.idFase = idFase;
    }

    public Mapa getMapa(){return mapa;}
    public void setMapa(Mapa mapa){
        this.mapa = mapa;
    }

    public List<Onda> getOndas(){return ondas;}
    public void setOndas(List<Onda> ondas){
        this.ondas = ondas;
    }

    public int getRecompensa(){return recompensa;}
    public void setRecompensa(int recompensa){
        this.recompensa = recompensa;
    }

    public Dificuldade getDificuldade(){ return dificuldade;}
    public void setDificuldade(Dificuldade dificuldade){
        this.dificuldade = dificuldade;
    }
}
