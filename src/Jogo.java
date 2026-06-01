import java.util.ArrayList;
import java.util.List;

public class Jogo {
    public int HUD;
    public List<Fase> listaFases = new ArrayList<>();

    public Jogo(int HUD, List<Fase> listaFases){
        this.HUD = HUD;
        this.listaFases = listaFases;
    }
}
