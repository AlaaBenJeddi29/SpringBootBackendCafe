package tn.esprit.tpcafe_alaa_benjeddi.services.commande;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Commande;
import tn.esprit.tpcafe_alaa_benjeddi.repositories.CommandeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandeService implements ICommandeServiceImpl {

    private final CommandeRepository commandeRepository;

    @Override
    public Commande addCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> saveCommandes(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }

    @Override
    public Commande selectCommandeByIdWithGet(long id) {
        return commandeRepository.findById(id).get();
    }

    @Override
    public Commande selectCommandeByIdWithOrElse(long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Commande> selectAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public void deleteCommandeById(long id) {
        commandeRepository.deleteById(id);
    }

    @Override
    public void deleteAllCommandes() {
        commandeRepository.deleteAll();
    }

    @Override
    public void deleteCommande(Commande commande) {
        commandeRepository.delete(commande);
    }

    @Override
    public long countingCommandes() {
        return commandeRepository.count();
    }

    @Override
    public boolean verifCommandeById(long id) {
        return commandeRepository.existsById(id);
    }
}