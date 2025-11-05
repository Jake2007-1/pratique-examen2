package entreprise;

public class Manager extends Employe {
    private Employe[]  equipe = new Employe[10];
    private int tailleEquipe = 0;


    public Manager(String nom, double salaire) {
        super(nom, salaire);

    }
    public void ajouterDansEquipe(Employe e){
        if (e == null || e == this || tailleEquipe >= equipe.length) return;
        equipe[tailleEquipe] = e;
        tailleEquipe++;
    }

    @Override
    public double calculerSalaire(){
        return  getSalaire() + 1000.0 * tailleEquipe;
    }

    @Override
    public String details(){
        return "équipes=" + tailleEquipe;
    }
}
