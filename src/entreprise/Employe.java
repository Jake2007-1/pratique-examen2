package entreprise;

import java.text.DecimalFormat;

public class Employe {
    private String id;
    private String nom;
    private double salaire;
    private static int cpt = 0;

    private static final DecimalFormat ID_FMT = new DecimalFormat("00000");
    private static final DecimalFormat ARGENT_FMT = new DecimalFormat("0.00$");

    public Employe(String nom, double salaire) {
        this.nom = nom;
        cpt++;
//      id = formaterID();
        id = ID_FMT.format(cpt);
        setSalaire(salaire);
    }

//    private static String formaterID(){
//        return ID_FMT.format(cpt);
//    }

    public void setSalaire(double salaire) {
        if(salaire < 0){
           throw new IllegalArgumentException("Salaire négatif interdit twin");

        }
        this.salaire = salaire;

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public static int getCpt() {
        return cpt;
    }

    public double calculerSalaire(){
        return salaire;
    }

    public void ajouterPrime(double montant){
        if(montant < 0){
            throw new IllegalArgumentException("Montant négatif interdit twin");
        }
        salaire += montant;
    }

    public String details(){
        return "";
    }

    @Override
    public String toString(){
        String texte = "[#" + id + "] " + nom + " - " + getClass().getSimpleName() + " - Salaire: " + ARGENT_FMT.format(calculerSalaire());
        String d = details();
        return  d.isEmpty() ? texte : texte + " (" + d + ")";
    }
}
