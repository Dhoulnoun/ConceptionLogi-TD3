package ExerciceCorr;

public abstract class OperateurUnaire extends Predicat{
    protected Predicat operande;

    protected OperateurUnaire(Predicat p) {
        super();
        this.operande = p;
    }

}
