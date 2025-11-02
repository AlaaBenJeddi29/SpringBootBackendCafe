package tn.esprit.tpcafe_alaa_benjeddi.services.cartefidelite;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_alaa_benjeddi.entities.CarteFidelite;
import tn.esprit.tpcafe_alaa_benjeddi.repositories.CarteFideliteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CarteFideliteService implements ICarteFideliteServiceImpl {

    private final CarteFideliteRepository carteFideliteRepository;

    @Override
    public CarteFidelite addCarteFidelite(CarteFidelite carteFidelite) {
        return carteFideliteRepository.save(carteFidelite);
    }

    @Override
    public List<CarteFidelite> saveCartesFidelite(List<CarteFidelite> cartesFidelite) {
        return carteFideliteRepository.saveAll(cartesFidelite);
    }

    @Override
    public CarteFidelite selectCarteFideliteByIdWithGet(long id) {
        return carteFideliteRepository.findById(id).get();
    }

    @Override
    public CarteFidelite selectCarteFideliteByIdWithOrElse(long id) {
        return carteFideliteRepository.findById(id).orElse(null);
    }

    @Override
    public List<CarteFidelite> selectAllCartesFidelite() {
        return carteFideliteRepository.findAll();
    }

    @Override
    public void deleteCarteFideliteById(long id) {
        carteFideliteRepository.deleteById(id);
    }

    @Override
    public void deleteAllCartesFidelite() {
        carteFideliteRepository.deleteAll();
    }

    @Override
    public void deleteCarteFidelite(CarteFidelite carteFidelite) {
        carteFideliteRepository.delete(carteFidelite);
    }

    @Override
    public long countingCartesFidelite() {
        return carteFideliteRepository.count();
    }

    @Override
    public boolean verifCarteFideliteById(long id) {
        return carteFideliteRepository.existsById(id);
    }
}