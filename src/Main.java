import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Pokemon> pokemons = new ArrayList<>();
        List<Pokemon> habilidades = new ArrayList<>();

        Habilidades choque_trovao = new Habilidades(
                1,
                "Choque do Trovão",
                50,
                TipoElemental.ELÉTRICO,
                100,
                2.5,
                true,
                AreaDeEfeito.DanoUnico
        );

        Habilidades chama_nenem = new Habilidades(
                2,
                "Chama Neném",
                40,
                TipoElemental.FOGO,
                90,
                3.0,
                true,
                AreaDeEfeito.DanoUnico
        );

        Pokemon pikachu = new Pokemon(
                1, "Pikachu", 150, 1,
                TipoElemental.ELÉTRICO,
                4, 2,
                Arrays.asList(choque_trovao),
                1
        );

        Pokemon charmander = new Pokemon(
                2, "Charmander", 100, 2,
                TipoElemental.FOGO,
                4, 2,
                Arrays.asList(chama_nenem),
                1
        );

        pokemons.add(pikachu);
        pokemons.add(charmander);

        Scanner pokebola = new Scanner(System.in);

        Interface.menuPrincipal();
        int valor = pokebola.nextInt();
        if(valor == 1){
            Interface.listarPokemons(pokemons);
        }
    }
}