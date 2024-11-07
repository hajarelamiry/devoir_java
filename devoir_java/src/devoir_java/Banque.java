package devoir_java;
import java.util.ArrayList;
import java.util.List;
public class Banque {
    public Long id;
    public String pays;
    public List<Compte> comptes = new ArrayList<>();
    public Banque(String pays) {
        this.pays = pays;
    }
    public void ajouterCompte(Compte compte) {
        comptes.add(compte);
        compte.banque = this; 
    }
}
