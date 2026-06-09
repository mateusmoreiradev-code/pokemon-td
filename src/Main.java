import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        cadastrar();

        Habilidades habilidade1 = new Habilidades(1, "Choque do trovão", 50, TipoElemental.ELÉTRICO, 100, 2.5, true, AreaDeEfeito.DanoUnico);
        Pokemon pikachu = new Pokemon(1, "pikachu", 150, 1, TipoElemental.ELÉTRICO, 4, 2, Arrays.asList(habilidade1), 1);

    }
}