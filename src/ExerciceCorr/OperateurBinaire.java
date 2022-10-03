package ExerciceCorr;

public abstract class OperateurBinaire extends Predicat {
    protected Predicat operande;
    protected Predicat operande2;

    public OperateurBinaire(Predicat operande, Predicat operande2) {
        super();
        this.operande = operande;
        this.operande2 = operande2;
    }





}
