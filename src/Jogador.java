public class Jogador {
    public int idJogador;
    public int vida;
    public int pokeDollar;
    public int pokeCoins;
    public int experience;

    public Jogador(int idJogador, int vida, int pokeDollar, int pokeCoins, int experience){
        this.idJogador = idJogador;
        this.vida = vida;
        this.pokeDollar = pokeDollar;
        this.pokeCoins = pokeCoins;
        this.experience = experience;
    }

    public int getIdJogador(){return idJogador;}
    public void setIdJogador(int idJogador){
        this.idJogador = idJogador;
    }

    public int getVida(){return vida;}
    public void setVida(int vida){
        this.vida = vida;
    }

    public int getPokeDollar(){return pokeDollar;}
    public void setPokeDollar(int pokeDollar){
        this.pokeDollar = pokeDollar;
    }

    public int getPokeCoins(){return pokeCoins;}
    public void setPokeCoins(int pokeCoins){
        this.pokeCoins = pokeCoins;
    }

    public int getExperience(){return experience;}
    public void setExperience(int experience){
        this.experience = experience;
    }
}
