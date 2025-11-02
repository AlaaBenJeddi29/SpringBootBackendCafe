package tn.esprit.tpcafe_alaa_benjeddi.services.cartefidelite;

import tn.esprit.tpcafe_alaa_benjeddi.entities.CarteFidelite;
import java.util.List;

public interface ICarteFideliteServiceImpl {

    CarteFidelite addCarteFidelite(CarteFidelite carteFidelite);
    List<CarteFidelite> saveCartesFidelite(List<CarteFidelite> cartesFidelite);
    CarteFidelite selectCarteFideliteByIdWithGet(long id);
    CarteFidelite selectCarteFideliteByIdWithOrElse(long id);
    List<CarteFidelite> selectAllCartesFidelite();
    void deleteCarteFideliteById(long id);
    void deleteAllCartesFidelite();
    void deleteCarteFidelite(CarteFidelite carteFidelite);
    long countingCartesFidelite();
    boolean verifCarteFideliteById(long id);
}