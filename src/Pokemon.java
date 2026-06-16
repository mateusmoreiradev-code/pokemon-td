import java.util.ArrayList;
import java.util.Arrays;
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

    Pokemon pikachu = new Pokemon(1, "pikachu", 150, 1, TipoElemental.ELÉTRICO, 4, 2, Arrays.asList(choque_trovão), 1);
    Pokemon charmander = new Pokemon(2, "charmander", 100, 2, TipoElemental.FOGO, 4, 2, Arrays.asList(chama_nenem), 1);
    Pokemon bulbassauro = new Pokemon(3, "bulbassauro", 100, 3, TipoElemental.PLANTA, 4, 2, Arrays.asList(sipo_de_vinha), 1);
    Pokemon squirtle = new Pokemon(4, "squirtle", 100, 4, TipoElemental.ÁGUA, 4, 2, Arrays.asList(jato_de_agua), 1);

    @Override
    public String toString() {
        return "Pokemon{" +
                "ID: " + idPokemon +
                "\nPokemon: " + nomePokemon +
                "\nCusto: " + custoPokemon +
                "\nAtaque: " + ataquePokemon +
                "\nTipo: " + tipoPokemon +
                "\nAlcance: " + alcancePokemon +
                "\nVelocidade de Ataque: " + velocidadeDeAtaquePokemon +
                "\nHabilidades: " + habilidadesPokemon +
                "\nEstágio de Evolução: " + evolucaoPokemon +
                '}';
    }
}