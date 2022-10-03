package ExerciceCorr;

public class Main {
    public static void main(String[] args) {
        Variables a = new Variables();
        Variables b = new Variables();
        Variables c = new Variables();
        Variables d = new Variables();
        Et e1 = new Et(a,b);
        Et e2 = new Et(c,d);
        Ou exp = new Ou(e1,e2);
        a.affecter(true);
        b.affecter(false);
        c.affecter(false);
        d.affecter(true);

        System.out.println("res "+ exp.Evaluation());
    }
}