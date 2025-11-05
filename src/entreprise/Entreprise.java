package entreprise;

public class Entreprise {
    public static void main(String[] args) {
    Developpeur alice = new Developpeur("Alice", 75000, 34);
    Vendeur bob = new Vendeur("Bob", 54144, 0.3, 1000000);
    Manager emile = new Manager("Manager", 183000);

    emile.ajouterDansEquipe(alice);
    emile.ajouterDansEquipe(bob);


    Employe[] entreprise = new Employe[3];

    entreprise[0] = emile;
    entreprise[1] = alice;
    entreprise[2] = bob;

    for(Employe employe: entreprise){
        if (employe != null){
            employe.setSalaire(1000000);
            System.out.println(employe);
        }
    }

    }
}
