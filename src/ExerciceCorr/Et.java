package ExerciceCorr;

public class Et extends OperateurBinaire {
    public Et(Predicat operande, Predicat operande2) {
        super(operande, operande2);
    }

    @Override
    public boolean Evaluation() {
        return this.operande.Evaluation() && this.operande2.Evaluation();
    }
}
