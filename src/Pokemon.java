import java.util.ArrayList;
import java.util.List;

public class Pokemon extends Habilidades {
    private int idPokemon;
    protected String nomePokemon;
    protected int custoPokemon;
    protected int ataquePokemon;
    protected TipoElemental tipoPokemon;
    protected double alcancePokemon;
    protected double velocidadeDeAtaquePokemon;
    protected List<Habilidades> habilidadesPokemon = new ArrayList<>();
    protected int evolucaoPokemon;

    public Pokemon(int idPokemon, String nomePokemon, int custoPokemon, int ataquePokemon, TipoElemental tipoPokemon, double alcancePokemon, double velocidadeDeAtaquePokemon, List<Habilidades> habilidadesPokemon, int evolucaoPokemon){
        super(idPokemon, nomePokemon, custoPokemon, tipoPokemon, ataquePokemon, 0, true, AreaDeEfeito.DanoUnico);
        
        this.idPokemon = idPokemon;
        this.nomePokemon = nomePokemon;
        this.custoPokemon = custoPokemon;
        this.ataquePokemon = ataquePokemon;
        this.tipoPokemon = tipoPokemon;
        this.alcancePokemon = alcancePokemon;
        this.velocidadeDeAtaquePokemon = velocidadeDeAtaquePokemon;
        this.habilidadesPokemon = habilidadesPokemon;
        this.evolucaoPokemon = evolucaoPokemon;
    };

    public String getNomePokemon() {
        return nomePokemon;
    }
    public void setNomePokemon(String nomePokemon){
        this.nomePokemon = nomePokemon;
    }

    public int getCustoPokemon(){
        return custoPokemon;
    }
    public void setCustoPokemon(int custoPokemon){
        this.custoPokemon = custoPokemon;
    }

    public int getAtaquePokemon(){
        return ataquePokemon;
    }
    public void setAtaquePokemon(int ataquePokemon){
        this.ataquePokemon = ataquePokemon;
    }

    public TipoElemental getTipoPokemon() {
        return tipoPokemon;
    }
    public void setTipoPokemon(TipoElemental tipoPokemon){
        this.tipoPokemon = tipoPokemon;
    }

    public double getAlcancePokemon(){
        return alcancePokemon;
    }
    public void setAlcancePokemon(double alcancePokemon){
        this.alcancePokemon = alcancePokemon;
    }

    public double getVelocidadeDeAtaquePokemon(){
        return velocidadeDeAtaquePokemon;
    }
    public void setVelocidadeDeAtaquePokemon(double velocidadeDeAtaquePokemon){
        this.velocidadeDeAtaquePokemon = velocidadeDeAtaquePokemon;
    }

    public List<Habilidades> getHabilidadesPokemon() {
        return habilidadesPokemon;
    }
    public void setHabilidadesPokemon(List<Habilidades> habilidadesPokemon){
        this.habilidadesPokemon = habilidadesPokemon;
    }

    public int getEvolucaoPokemon() {
        return evolucaoPokemon;
    }

    public void setEvolucaoPokemon(int evolucaoPokemon) {
        this.evolucaoPokemon = evolucaoPokemon;
    }

    public String toString() {
        return "Pokemon{" +
                "idPokemon=" + idPokemon +
                ", nomePokemon='" + nomePokemon + '\'' +
                ", custoPokemon=" + custoPokemon +
                ", ataquePokemon=" + ataquePokemon +
                ", tipoPokemon=" + tipoPokemon +
                ", alcancePokemon=" + alcancePokemon +
                ", velocidadeDeAtaquePokemon=" + velocidadeDeAtaquePokemon +
                ", habilidadesPokemon=" + habilidadesPokemon +
                ", evolucaoPokemon=" + evolucaoPokemon +
                '}';
    }
}