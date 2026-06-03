
public class Interface {

    public static void limparTela() {
        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (Exception e) {
            System.out.println("Não foi possível limpar a tela.");
        }
    }

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

        System.out.println("| [1] Cadastrar Pokémon                           |");
        System.out.println("| [2] Cadastrar Habilidade                        |");
        System.out.println("| [3] Listar Pokémon                              |");
        System.out.println("| [4] Listar Habilidades                          |");
        System.out.println("| [5] Buscar Pokémon                              |");
        System.out.println("| [6] Buscar Habilidade                           |");
        System.out.println("| [7] Associar Habilidade a Pokémon               |");
        System.out.println("| [8] Excluir Pokémon                             |");
        System.out.println("| [9] Excluir Habilidade                          |");
        System.out.println("| [0] Sair                                        |");

        linha();
        System.out.print("Escolha uma opção: ");
    }

    public static void telaSucesso(String mensagem) {
        linha();
        System.out.println("|              OPERAÇÃO REALIZADA                 |");
        linha();
        System.out.printf("| %-48s |%n", mensagem);
        linha();
    }

    public static void telaErro(String mensagem) {
        linha();
        System.out.println("|                    ERRO                         |");
        linha();
        System.out.printf("| %-48s |%n", mensagem);
        linha();
    }

    public static void telaAviso(String mensagem) {
        linha();
        System.out.println("|                   AVISO                         |");
        linha();
        System.out.printf("| %-48s |%n", mensagem);
        linha();
    }

    public static void telaConfirmacao(String mensagem) {
        linha();
        System.out.println("|                CONFIRMAÇÃO                      |");
        linha();
        System.out.printf("| %-48s |%n", mensagem);
        linha();
    }

    public static void listarTiposElementais() {
        titulo("TIPOS ELEMENTAIS");

        int codigo = 1;

        for (TipoElemental tipo : TipoElemental.values()) {
            System.out.printf("| [%2d] %-42s |%n", codigo, tipo);
            codigo++;
        }

        linha();
    }

    public static void listarAreasDeEfeito() {
        titulo("ÁREA DE EFEITO");

        int codigo = 1;

        for (AreaDeEfeito area : AreaDeEfeito.values()) {
            System.out.printf("| [%2d] %-42s |%n", codigo, area);
            codigo++;
        }

        linha();
    }
}