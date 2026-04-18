import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Habilidades habilidade1 = new Habilidades(1, "Choque do trovão", 50, TipoElemental.ELÉTRICO, 100, 2.5, true, AreaDeEfeito.Danoúnico);
        Pokemon pikachu = new Pokemon(1, "pikachu", 150, 1, TipoElemental.ELÉTRICO, 4, 2, Arrays.asList(habilidade1), 1);
        System.out.println(pikachu);
    }
}