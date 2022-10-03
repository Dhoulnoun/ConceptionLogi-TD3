package ExerciceCorr;

public class Variables extends Predicat{

    private boolean valeur;

    public Variables() {
        this.valeur = false;
    }

    @Override
    public boolean Evaluation() {
        return valeur;
    }
    public void affecter(boolean v){
        this.valeur=v;
    }
}
