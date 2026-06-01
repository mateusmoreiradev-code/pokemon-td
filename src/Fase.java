import java.util.ArrayList;
import java.util.List;

public class Fase {
    public int idFase;
    public Mapa mapa;
    public List<Onda> ondas = new ArrayList<>();
    public int recompensa;
    public Dificuldade dificuldade;

    public Fase(int idFase, Mapa mapa, List<Onda> ondas, int recompensa, Dificuldade dificuldade){
        this.idFase = idFase;
        this.mapa = mapa;
        this.ondas = ondas;
        this.recompensa = recompensa;
        this.dificuldade = dificuldade;
    }
}
