public class Habilidades{
    private int idHabilidade;
    protected String nomeHabilidade;
    protected int custoHabilidade;
    protected TipoElemental teHabilidade;
    protected int danoHabilidade;
    protected double cooldownHabilidade;
    protected boolean isAtivaHabilidade;
    protected AreaDeEfeito adeHabilidade;

    public Habilidades(int idHabilidade, String nomeHabilidade, int custoHabilidade, TipoElemental teHabilidade, int danoHabilidade, double cooldownHabilidade, boolean isAtivaHabilidade, AreaDeEfeito adeHabilidade){
        this.idHabilidade = idHabilidade;
        this.nomeHabilidade = nomeHabilidade;
        this.custoHabilidade = custoHabilidade;
        this.teHabilidade = teHabilidade;
        this.danoHabilidade = danoHabilidade;
        this.cooldownHabilidade = cooldownHabilidade;
        this.isAtivaHabilidade = isAtivaHabilidade;
        this.adeHabilidade = adeHabilidade;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }
    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public int getCustoHabilidade(){
        return custoHabilidade;
    }
    public void setCustoHabilidade(int custoHabilidade) {
        this.custoHabilidade = custoHabilidade;
    }

    public TipoElemental getTeHabilidade() {
        return teHabilidade;
    }
    public void setTeHabilidade(TipoElemental teHabilidade) {
        this.teHabilidade = teHabilidade;
    }

    public int getDanoHabilidade() {
        return danoHabilidade;
    }
    public void setDanoHabilidade(int danoHabilidade) {
        this.danoHabilidade = danoHabilidade;
    }

    public double getCooldownHabilidade() {
        return cooldownHabilidade;
    }
    public void setCooldownHabilidade(double cooldownHabilidade) {
        this.cooldownHabilidade = cooldownHabilidade;
    }

    public boolean isAtivaHabilidade() {
        return isAtivaHabilidade;
    }
    public void setAtivaHabilidade(boolean ativaHabilidade) {
        isAtivaHabilidade = ativaHabilidade;
    }

    public AreaDeEfeito getAdeHabilidade() {
        return adeHabilidade;
    }
    public void setAdeHabilidade(AreaDeEfeito adeHabilidade) {
        this.adeHabilidade = adeHabilidade;
    }

    public String toString() {
        return "Habilidade: " + nomeHabilidade + ", Custo: " + custoHabilidade + ", Tipo Elemental: " + teHabilidade + ", Dano: " + danoHabilidade + ", Cooldown: " + cooldownHabilidade + ", Ativa: " + isAtivaHabilidade + ", Área de Efeito: " + adeHabilidade;
    }
}