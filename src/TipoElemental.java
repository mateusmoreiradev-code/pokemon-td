public enum TipoElemental {
    NORMAL, FOGO, ÁGUA, GRAMA, ELÉTRICO, GELO, LUTADOR, VENENOSO, TERRESTRE, VOADOR, PSIQUICO, INSETO, PEDRA, FANTASMA, DRAGÃO, AÇO, NOTURNO, FADA, PLANTA;

    public boolean ehEfetivo(TipoElemental outro){
        return (this == FOGO && outro == PLANTA) ||
                (this == PLANTA && outro == ÁGUA) ||
                (this == ÁGUA && outro == FOGO) ||
                (this == ELÉTRICO && outro == ÁGUA);
    }
}