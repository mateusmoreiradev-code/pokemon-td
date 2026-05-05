public class Balao {
    private int idBalao;
    protected int hpBalao;
    protected float vdmBalao;
    protected boolean isCamuflado;
    protected boolean isBlindado;
    protected boolean isEnxame;

    public Balao(int idBalao, int hpBalao, float vdmBalao, boolean isCamuflado, boolean isBlindado, boolean isEnxame){
        this.idBalao = idBalao;
        this.hpBalao = hpBalao;
        this.vdmBalao = vdmBalao;
        this.isCamuflado = isCamuflado;
        this.isBlindado = isBlindado;
        this.isEnxame = isEnxame;
    };

    public int getHpBalao(){
        return hpBalao;
    }
    public void setHpBalao(int hpBalao){
        this.hpBalao = hpBalao;
    }

    public float getVdmBalao(){
        return vdmBalao;
    }
    public void setVdmBalao(float vdmBalao){
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

}
