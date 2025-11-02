package tn.esprit.tpcafe_alaa_benjeddi.services.detailcommande;

import tn.esprit.tpcafe_alaa_benjeddi.entities.Detail_Commande;
import java.util.List;

public interface IDetailCommandeServiceImpl {

    Detail_Commande addDetailCommande(Detail_Commande detailCommande);
    List<Detail_Commande> saveDetailsCommande(List<Detail_Commande> detailsCommande);
    Detail_Commande selectDetailCommandeByIdWithGet(long id);
    Detail_Commande selectDetailCommandeByIdWithOrElse(long id);
    List<Detail_Commande> selectAllDetailsCommande();
    void deleteDetailCommandeById(long id);
    void deleteAllDetailsCommande();
    void deleteDetailCommande(Detail_Commande detailCommande);
    long countingDetailsCommande();
    boolean verifDetailCommandeById(long id);
}