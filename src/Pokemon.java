public class Pokemon {
    protected int idPokemon;
    protected String nomePokemon;
    protected int custoPokemon;
    protected int ataquePokemon;
    protected TipoElemental tipoPokemon;
    protected double alcancePokemon;
    protected double velocidadeDeAtaquePokemon;
    protected List<Habilidades> habilidadesPokemon = new ArrayList<>();
    protected int evolucaoPokemon;

    public Pokemon(int idPokemon, String nomePokemon, int custoPokemon, int ataquePokemon, TipoElemental tipoPokemon, double alcancePokemon, double velocidadeDeAtaquePokemon, List<Habilidades> habilidadesPokemon, int evolucaoPokemon){
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
}