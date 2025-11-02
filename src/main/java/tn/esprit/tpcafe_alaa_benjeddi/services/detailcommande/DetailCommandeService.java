package tn.esprit.tpcafe_alaa_benjeddi.services.detailcommande;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Detail_Commande;
import tn.esprit.tpcafe_alaa_benjeddi.repositories.Detail_CommandeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DetailCommandeService implements IDetailCommandeServiceImpl {

    private final Detail_CommandeRepository detailCommandeRepository;

    @Override
    public Detail_Commande addDetailCommande(Detail_Commande detailCommande) {
        return detailCommandeRepository.save(detailCommande);
    }

    @Override
    public List<Detail_Commande> saveDetailsCommande(List<Detail_Commande> detailsCommande) {
        return detailCommandeRepository.saveAll(detailsCommande);
    }

    @Override
    public Detail_Commande selectDetailCommandeByIdWithGet(long id) {
        return detailCommandeRepository.findById(id).get();
    }

    @Override
    public Detail_Commande selectDetailCommandeByIdWithOrElse(long id) {
        return detailCommandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Detail_Commande> selectAllDetailsCommande() {
        return detailCommandeRepository.findAll();
    }

    @Override
    public void deleteDetailCommandeById(long id) {
        detailCommandeRepository.deleteById(id);
    }

    @Override
    public void deleteAllDetailsCommande() {
        detailCommandeRepository.deleteAll();
    }

    @Override
    public void deleteDetailCommande(Detail_Commande detailCommande) {
        detailCommandeRepository.delete(detailCommande);
    }

    @Override
    public long countingDetailsCommande() {
        return detailCommandeRepository.count();
    }

    @Override
    public boolean verifDetailCommandeById(long id) {
        return detailCommandeRepository.existsById(id);
    }
}