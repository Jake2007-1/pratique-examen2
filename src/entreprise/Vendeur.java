package entreprise;

public class Vendeur extends Employe{

    private double totlaVentes;
    private double tauxDeComission;

    public Vendeur(String nom, double salaire, double tauxDeComission, double totlaVentes) {
        super(nom, salaire);
        setTauxDeComission(tauxDeComission);
        setTotalVentes(totlaVentes);
    }

    private void setTotalVentes(double totlaVentes) {
        if (totlaVentes < 0){
            throw new IllegalArgumentException("Total ventes négatif interdit twin");
        }
        this.totlaVentes = totlaVentes;
    }

    public void setTauxDeComission(double tauxDeComission) {
        if (tauxDeComission < 0 || tauxDeComission > 1){
            throw new IllegalArgumentException("Commission doit être compris entre 0 et 1");
        }
        this.tauxDeComission = tauxDeComission;
    }

    @Override
    public double calculerSalaire(){
        return getSalaire() + totlaVentes * tauxDeComission;
    }

    @Override
    public String details(){
        return "Ventes="+totlaVentes + ", taux=" + tauxDeComission;
    }
}
