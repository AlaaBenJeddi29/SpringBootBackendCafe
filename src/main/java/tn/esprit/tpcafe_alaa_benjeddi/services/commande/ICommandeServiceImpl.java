package tn.esprit.tpcafe_alaa_benjeddi.services.commande;

import tn.esprit.tpcafe_alaa_benjeddi.entities.Commande;
import java.util.List;

public interface ICommandeServiceImpl {

    Commande addCommande(Commande commande);
    List<Commande> saveCommandes(List<Commande> commandes);
    Commande selectCommandeByIdWithGet(long id);
    Commande selectCommandeByIdWithOrElse(long id);
    List<Commande> selectAllCommandes();
    void deleteCommandeById(long id);
    void deleteAllCommandes();
    void deleteCommande(Commande commande);
    long countingCommandes();
    boolean verifCommandeById(long id);
}