package entreprise;

public class Developpeur  extends Employe{
    private int nbBugCor;
    private double bonusParBug;
    private static double bonusBase = 1.00;

    public Developpeur(String nom, double salaire, int nbBugCor) {
        super(nom, salaire);
        setBugCor(nbBugCor);

    }

    private void setBugCor(int nbBugCor) {
        if(nbBugCor < 0){
            throw new IllegalArgumentException("Bug négatif interdit twin");
        }
        this.nbBugCor = nbBugCor;
        recalculerBonus();
    }

    private void recalculerBonus() {
        int ratio = (int) Math.floor(nbBugCor / 5.0);
        bonusParBug = bonusBase + ratio * 0.50;
    }

    @Override
    public double calculerSalaire(){
        return  getSalaire() + nbBugCor * bonusParBug;
    }

    @Override
    public String details(){
        return  "bugs=" + nbBugCor + ", bonus/bug=" + bonusParBug;
    }
}
