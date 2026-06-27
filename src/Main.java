import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        Scanner pokebola = new Scanner(System.in);

        pokemons.add(pikachu);
        pokemons.add(charmander);

        iniciarPartida(pokemons);

    }

    static void iniciarPartida(List<Pokemon> pokemons){

        Scanner scanner = new Scanner(System.in);

        int vidaBase = 20;
        int dinheiro = 500;
        int onda = 1;
        boolean jogando = true;
        List<Pokemon> pokemonsJogador = new ArrayList<>();

        while (jogando) {

            System.out.println("\n==============================");
            System.out.println("         POKEMON TD");
            System.out.println("==============================");
            System.out.println("Vida da Base: " + vidaBase);
            System.out.println("Dinheiro: $" + dinheiro);
            System.out.println("Onda: " + onda);
            System.out.println("==============================");

            System.out.println("1 - Colocar Pokémon");
            System.out.println("2 - Iniciar Onda");
            System.out.println("3 - Ver Status");
            System.out.println("0 - Desistir");

            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\n\n===== POKÉMONS =====");

                    for (int i = 0; i < pokemons.size(); i++) {

                        Pokemon p = pokemons.get(i);

                        System.out.println((i + 1) + " - " +
                                p.getNomePokemon() +
                                " - $" + p.getCustoPokemon());
                    }

                    System.out.print("Escolha: ");
                    int escolha = scanner.nextInt();

                    if (escolha < 1 || escolha > pokemons.size()) {
                        System.out.println("Pokémon inválido.");
                        break;
                    }

                    Pokemon escolhido = pokemons.get(escolha - 1);

                    if (dinheiro >= escolhido.getCustoPokemon()) {

                        dinheiro -= escolhido.getCustoPokemon();
                        pokemonsJogador.add(escolhido);

                        System.out.println(escolhido.getNomePokemon() + " foi colocado!");
                        System.out.println("Dinheiro restante: $" + dinheiro);

                    } else {

                        System.out.println("Dinheiro insuficiente!");

                    }

                    break;

                case 2:

                    System.out.println("\n\nA onda começou!");

                    // Simulação da onda
                    int danoRecebido = (int) (Math.random() * 4);

                    vidaBase -= danoRecebido;

                    int recompensa = 100;

                    dinheiro += recompensa;

                    System.out.println("A onda terminou.");
                    System.out.println("A base perdeu " + danoRecebido + " de vida.");
                    System.out.println("Você ganhou $" + recompensa + ".");

                    onda++;

                    break;

                case 3:

                    System.out.println("\n===== STATUS =====");
                    System.out.println("Vida: " + vidaBase);
                    System.out.println("Dinheiro: $" + dinheiro);
                    System.out.println("Onda Atual: " + onda);

                    int qtdPikachu = 0;
                    int qtdCharmander = 0;

                    for (Pokemon p : pokemonsJogador) {

                        if (p.getNomePokemon().equalsIgnoreCase("Pikachu")) {
                            qtdPikachu++;
                        }

                        if (p.getNomePokemon().equalsIgnoreCase("Charmander")) {
                            qtdCharmander++;
                        }
                    }

                    System.out.println("\nPokémons:");
                    System.out.println("Pikachu: " + qtdPikachu);
                    System.out.println("Charmander: " + qtdCharmander);

                    break;  

                case 0:

                    jogando = false;
                    System.out.println("Você desistiu da partida.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

            if (vidaBase <= 0) {

                System.out.println("\nGAME OVER!");
                jogando = false;

            }
        }

        System.out.println("Fim da partida.");
    }
}