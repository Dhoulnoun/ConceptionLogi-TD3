package ExerciceCorr;

public class Non extends OperateurUnaire {
    protected Non(Predicat p) {
        super(p);
    }

    @Override
    public boolean Evaluation() {
        return !operande.Evaluation();
    }
}