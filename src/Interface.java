import java.util.List;

public class Interface {

    public static void limparTela() {
        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (Exception e) {
            System.out.println("Não foi possível limpar a tela.");
        }
    }

    public static void pular(){System.out.println("\n");}

    public static void linha() {
        System.out.println("+-------------------------------------------------+");
    }

    public static void titulo(String texto) {
        linha();
        System.out.printf("|%-49s|%n", "");
        System.out.printf("|%29s%-20s|%n", texto, "");
        System.out.printf("|%-49s|%n", "");
        linha();
    }

    public static void menuPrincipal() {
        limparTela();

        titulo("POKEMON - TD");

        System.out.println("| [1] Listar Pokémon                              |");
        System.out.println("| [2] Comprar Pokémon                             |");
        System.out.println("| [3] Listar Habilidades                          |");
        System.out.println("| [5] Buscar Pokémon                              |");
        System.out.println("| [8] Vender Pokémon                              |");
        System.out.println("| [9] Excluir Habilidade                          |");
        System.out.println("| [0] Sair                                        |");

        linha();
        System.out.print("Escolha uma opção: ");
    }

    public static void telaSucesso(String mensagem) {
        pular();
        linha();
        System.out.println("|              OPERAÇÃO REALIZADA                 |");
        linha();
        System.out.printf("| %-47s |%n", mensagem);
        linha();
    }

    public static void telaErro(String mensagem) {
        pular();
        linha();
        System.out.println("|                    ERRO                         |");
        linha();
        System.out.printf("| %-47s |%n", mensagem);
        linha();
    }

    public static void telaAviso(String mensagem) {
        pular();
        linha();
        System.out.println("|                   AVISO                         |");
        linha();
        System.out.printf("| %-47s |%n", mensagem);
        linha();
    }

    public static void telaConfirmacao(String mensagem) {
        pular();
        linha();
        System.out.println("|                CONFIRMAÇÃO                      |");
        linha();
        System.out.printf("| %-47s |%n", mensagem);
        linha();
    }

    public static void listarPokemons(List<Pokemon> pokemons) {

        titulo("LISTA DE POKÉMONS");

        if (pokemons.isEmpty()) {
            telaAviso("Nenhum Pokémon cadastrado!");
            return;
        }

        for (Pokemon pokemon : pokemons) {
            linha();
            System.out.println(pokemon); // chama automaticamente o toString()
        }

        linha();
    }

    public static void menu(){
        linha();
        System.out.println("====================");
        System.out.println("POKEMON TD");
        System.out.println("====================");
        System.out.println("1 - Novo jogo");
        System.out.println("2 - Pokedex");
        System.out.println("3 - Créditos");
        System.out.println("0 - Sair");
        linha();
    }

    public static void menuJogo(){
        linha();
        System.out.println("====================");
        System.out.println("     POKEMON TD     ");
        System.out.println("====================");
        System.out.println("1 - Iniciar fase");
        System.out.println("2 - Comprar Pokemon");
        System.out.println("3 - Status");
        System.out.println("0 - Sair");
        linha();
    }
}