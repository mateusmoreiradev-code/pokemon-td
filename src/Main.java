import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static final Scanner pokebola = new Scanner(System.in);
    private List<Habilidades> habilidade = new ArrayList<>();
    private List<Pokemon> pokemons = new ArrayList<>();

    private static int idHabilidade = 1;
    private static int idPokemon = 1;

    public static void main(String[] args){
        Habilidades habilidade1 = new Habilidades(1, "Choque do trovão", 50, TipoElemental.ELÉTRICO, 100, 2.5, true, AreaDeEfeito.Danoúnico);
        Pokemon pikachu = new Pokemon(1, "pikachu", 150, 1, TipoElemental.ELÉTRICO, 4, 2, Arrays.asList(habilidade1), 1);



        System.out.println(pikachu);
    }
}