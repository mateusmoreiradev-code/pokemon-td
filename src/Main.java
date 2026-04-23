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

    static void limparConsole(){
        try{
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (final Exception e){
            System.out.println(e);
        }
    }

    static void cadastrar(){
        Scanner menuCadastro = new Scanner(System.in);
        Scanner codTipoElementalSelecionado = new Scanner(System.in);

        System.out.println("""
                - - - - CADASTRAR - - - -
                Digite o número correspondente ao cadastro que deseja realizar:
                1. Pokémon
                2. Habilidade
                """);
        String menuSelecionado = menuCadastro.nextLine();

        switch (menuSelecionado) {
            case "1":
                limparConsole();
                System.out.println("""
                        - - - - CADASTRAR POKEMON - - - -
                        Digite o nome do pokémon:
                        """);
                String nomePokemon = pokebola.nextLine();

                System.out.println("Digite o custo: ");
                int custoPokemon = pokebola.nextInt();

                System.out.println("Digite o ataque base: ");
                int ataquePokemon = pokebola.nextInt();

                System.out.println("Digite o valor correspondente ao tipo elemental do pokémon: ");

                int codTipoElemental = 1;

                for (TipoElemental elemento : TipoElemental.values()) {
                    System.out.println(codTipoElemental + " - " + elemento);
                    codTipoElemental++;
                }
                String codElemental = codTipoElementalSelecionado.nextLine();

                TipoElemental tipoPokemon;
                switch (codElemental){
                    case "1":
                        tipoPokemon = TipoElemental.NORMAL;
                        break;
                    case "2":
                        tipoPokemon = TipoElemental.FOGO;
                        break;
                    case "3":
                        tipoPokemon = TipoElemental.ÁGUA;
                        break;
                    case "4":
                        tipoPokemon = TipoElemental.GRAMA;
                        break;
                    case "5":
                        tipoPokemon = TipoElemental.ELÉTRICO;
                        break;
                    case "6":
                        tipoPokemon = TipoElemental.GELO;
                        break;
                    case "7":
                        tipoPokemon = TipoElemental.LUTADOR;
                        break;
                    case "8":
                        tipoPokemon = TipoElemental.VENENOSO;
                        break;
                    case "9":
                        tipoPokemon = TipoElemental.TERRESTRE;
                        break;
                    case "10":
                        tipoPokemon = TipoElemental.VOADOR;
                        break;
                    case "11":
                        tipoPokemon = TipoElemental.PSIQUICO;
                        break;
                    case "12":
                        tipoPokemon = TipoElemental.INSETO;
                        break;
                    case "13":
                        tipoPokemon = TipoElemental.PEDRA;
                        break;
                    case "14":
                        tipoPokemon = TipoElemental.FANTASMA;
                        break;
                    case "15":
                        tipoPokemon = TipoElemental.DRAGÃO;
                        break;
                    case "16":
                        tipoPokemon = TipoElemental.AÇO;
                        break;
                    case "17":
                        tipoPokemon = TipoElemental.NOTURNO;
                        break;
                    case "18":
                        tipoPokemon = TipoElemental.FADA;
                        break;
                    case "19":
                        tipoPokemon = TipoElemental.PLANTA;
                        break;
                    default:
                        System.out.println("Valor inválido! Tente novamente.");
                        return;
                }

                System.out.println("Digite o alcance do ataque base: ");
                double alcancePokemon = pokebola.nextDouble();

                System.out.println("Digite a velocidade de ataque base: ");
                double velocidadeDeAtaquePokemon = pokebola.nextDouble();

                // inserir habilidades disponiveis aqui

                System.out.println("Digite o estágio de evolução de forma numeral (1, 2 ou 3)");
                int evolucaoPokemon = pokebola.nextInt();

                Pokemon pokemon = new Pokemon(idPokemon, nomePokemon, custoPokemon, ataquePokemon, tipoPokemon, alcancePokemon, velocidadeDeAtaquePokemon, Arrays.asList(), evolucaoPokemon);

                idPokemon++;

                System.out.println("Pokémon cadastrado com sucesso!!!");

                System.out.println(pokemon);
                break;
            default:
                break;
        };
    }

    public static void main(String[] args){
        Habilidades habilidade1 = new Habilidades(1, "Choque do trovão", 50, TipoElemental.ELÉTRICO, 100, 2.5, true, AreaDeEfeito.Danoúnico);
        Pokemon pikachu = new Pokemon(1, "pikachu", 150, 1, TipoElemental.ELÉTRICO, 4, 2, Arrays.asList(habilidade1), 1);

        cadastrar();


    }
}