import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private int idHUD;
    private List<Fase> listaFases = new ArrayList<>();


    public Jogo(int idHUD, List<Fase> listaFases){
        this.idHUD = idHUD;
        this.listaFases = listaFases;
    }

    public int getIdHUD(){return idHUD;}
    public void setIdHUD(int idHUD){
        this.idHUD = idHUD;
    }

    public List<Fase> getListaFases(){ return listaFases;}
    public void setListaFases(List<Fase> listaFases){
        this.listaFases = listaFases;
    }

}
