package devoir_java;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Transaction {

    public enum TypeTransaction {
        VIRINI, VIREST, VIRCHAC, VIRMULTA
    }
    public Date setup;
    public String reference;
    public TypeTransaction type;
    public List<Compte> comptes = new ArrayList<>();
    public Transaction() {
        this.reference = UUID.randomUUID().toString(); 
    }

    public Transaction(List<Compte> comptes) {
        this.comptes = comptes;
        this.reference = UUID.randomUUID().toString();
        this.type = calculerTypeTransaction(comptes);
    }

    private TypeTransaction calculerTypeTransaction(List<Compte> comptes) {
        if (comptes.size() == 1) return TypeTransaction.VIRINI;

        Banque banquePremiere = comptes.get(0).banque;
        String paysPremier = banquePremiere.pays;
        boolean memeBanque = true;
        boolean memePays = true;

        for (Compte compte : comptes) {
            if (!compte.banque.equals(banquePremiere)) memeBanque = false;
            if (!compte.banque.pays.equals(paysPremier)) memePays = false;
        }

        if (memeBanque) return TypeTransaction.VIRINI;
        if (memePays) return TypeTransaction.VIREST;
        if (!memeBanque && !memePays) return TypeTransaction.VIRCHAC;
        return TypeTransaction.VIRMULTA;
    }
    public String toString() {
        return "Transaction {" +
               "reference='" + reference + '\'' +
               ", setup=" + setup +
               ", type=" + type +
               ", comptes=" + comptes +
               '}';
    }
}
