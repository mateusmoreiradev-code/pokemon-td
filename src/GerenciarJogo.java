import java.util.ArrayList;
import java.util.List;

public class GerenciarJogo {
    private List<Balao> baloesNaTela = new ArrayList<>();
    private Onda ondaAtual;
    private long ultimoSpawnTime = 0;

    public void iniciarNovaOnda(Onda onda) {
        this.ondaAtual = onda;
        this.ultimoSpawnTime = System.currentTimeMillis();
        System.out.println("Onda " + onda.getIdOnda() + " iniciada!");
    }

    public void atualizarJogo() {
        long tempoAtual = System.currentTimeMillis();

        if (ondaAtual != null && !ondaAtual.getInimigos().isEmpty()) {
            long delayNecessario = (long) (ondaAtual.getIntervaloSpawn() * 1000);

            if (tempoAtual - ultimoSpawnTime >= delayNecessario) {
                Balao balaoQueVaiNascer = ondaAtual.getInimigos().remove(0);

                baloesNaTela.add(balaoQueVaiNascer);

                ultimoSpawnTime = tempoAtual;
                System.out.println("Um balão nasceu na trilha!");
            }
        }

        for (int i = 0; i < baloesNaTela.size(); i++) {
            baloesNaTela.get(i).atualizar();
            if (baloesNaTela.get(i).getHpBalao() <= 0) { baloesNaTela.remove(i); }
        }
    }
}