import java.util.ArrayList;
import java.util.List;

public class Balao {
    private int idBalao;
    protected int hpBalao;
    protected double vdmBalao = 0.1;
    protected boolean isCamuflado;
    protected boolean isBlindado;
    protected boolean isEnxame;
    private double x, y;
    private List<Coordenadas> caminho;
    private int indiceCaminho = 0;

    //CONSTRUTOR
    public Balao(int idBalao, int hpBalao, boolean isCamuflado, boolean isBlindado, boolean isEnxame, List<Coordenadas> caminho){
        this.idBalao = idBalao;
        this.hpBalao = hpBalao;
        this.isCamuflado = isCamuflado;
        this.isBlindado = isBlindado;
        this.isEnxame = isEnxame;
        this.caminho = caminho;
        this.x = caminho.get(0).x;
        this.y = caminho.get(0).y;
    }

    //ENCAPSULAMENTO
    public int getHpBalao(){
        return hpBalao;
    }
    public void setHpBalao(int hpBalao){
        this.hpBalao = hpBalao;
    }

    public double getVdmBalao(){
        return vdmBalao;
    }
    public void setVdmBalao(double vdmBalao){
        this.vdmBalao = vdmBalao;
    }

    public boolean getIsCamuflado(){
        return isCamuflado;
    }
    public void setIsCamuflado(boolean isCamuflado){
        this.isCamuflado = isCamuflado;
    }

    public boolean getIsBlindado(){
        return isBlindado;
    }
    public void setIsBlindado(boolean isBlindado){
        this.isBlindado = isBlindado;
    }

    public boolean getIsEnxame(){
        return isEnxame;
    }
    public void setIsEnxame(boolean isEnxame){
        this.isEnxame = isEnxame;
    }

    //METODOS
    public void atualizar(){
        if (indiceCaminho >= caminho.size()){
            return;
        }

        Coordenadas alvo = caminho.get(indiceCaminho);

        double dx = alvo.x - this.x;
        double dy = alvo.y - this.y;
        double distancia = Math.sqrt(dx * dx + dy * dy);
        if (distancia < vdmBalao) {
            this.x = alvo.x;
            this.y = alvo.y;
            indiceCaminho++;
        } else {
            // Move suavemente em direção ao alvo
            this.x += (dx / distancia) * vdmBalao;
            this.y += (dy / distancia) * vdmBalao;
        }
    }

    public static void ganhaCoins(){

    }

}
