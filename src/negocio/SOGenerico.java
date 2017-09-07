package negocio;

public abstract class SOGenerico {
    
    private Processador cpu;
    
    public abstract void iniciar();
    
    public abstract Processo proximaExecucao();
    
    public abstract void aumentarQuantum(Processo p);
    
    public abstract void reduzirQuantum(Processo p);
    
}
