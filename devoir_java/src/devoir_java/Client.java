package devoir_java;
import java.util.ArrayList;
import java.util.List;


public class Client {
    public Long numClient;
    public String nom;
    public String prenom;
    public String adresse;
    public String phone;
    public String email;

    public List<Compte> comptes = new ArrayList<>();
    public Client(Long numClient,String nom, String prenom, String adresse, String phone, String email) {
        this.nom = nom;
        this.numClient = numClient;
        this.prenom = prenom;
        this.adresse = adresse;
        this.phone = phone;
        this.email = email;
    }
    public void addCompte(Compte compte) {
        comptes.add(compte);
        compte.setClient(this);
    }

    public void removeCompte(Compte compte) {
        comptes.remove(compte);
        compte.setClient(null);
    }
    public String toString() {
        return "Client {" +
               "numClient=" + numClient +
               ", nom='" + nom + '\'' +
               ", prenom='" + prenom + '\'' +
               ", adresse='" + adresse + '\'' +
               ", phone='" + phone + '\'' +
               ", email='" + email + '\'' +
               ", comptes=" + comptes +
               '}';
    }
}
