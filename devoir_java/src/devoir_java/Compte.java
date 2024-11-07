package devoir_java;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compte {

    public Long numcompte;
    public Date datecreation;
    public Date dateupdate;
    public Banque banque;
    public Client client;
    public List<Transaction> transactions = new ArrayList<>();

    public Compte(Long numcompte, Date datecreation,Date dateupdate) {
        this.numcompte=numcompte;
        this.datecreation=datecreation;
        this.dateupdate=dateupdate;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void setbanque(Banque banque) {
        this.banque = banque;
    }
    public String toString() {
        return "Compte {" +
               "numcompte=" + numcompte +
               ", datecreation=" + datecreation +
               ", dateupdate=" + dateupdate +
               ", banque=" + (banque != null ?banque.pays : "Aucune banque assignée") +
               ", client=" + (client != null ? client.nom + " " + client.prenom : "Aucun client assigné") +
               ", transactions=" + transactions +
               '}';
    }
}
