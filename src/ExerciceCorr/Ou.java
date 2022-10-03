package ExerciceCorr;

public class Ou extends OperateurBinaire {

    public Ou(Predicat operande, Predicat operande2) {
        super(operande, operande2);
    }

    @Override
    public boolean Evaluation() {
        return this.operande.Evaluation()|| this.operande2.Evaluation();
    }
}