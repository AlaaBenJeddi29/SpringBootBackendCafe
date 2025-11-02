package tn.esprit.tpcafe_alaa_benjeddi.services.adresse;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Adresse;
import tn.esprit.tpcafe_alaa_benjeddi.repositories.AdresseRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AdresseService implements IAdresseServiceImpl {
    private final AdresseRepository adresseRepository;

    @Override
    public Adresse addAdresse(Adresse adr) {
        return adresseRepository.save(adr);
    }

    @Override
    public List<Adresse> saveAdresses(List<Adresse> adresses) {
        return adresseRepository.saveAll(adresses);
    }

    @Override
    public Adresse selectAdresseByIdWithGet(long id) {
        return adresseRepository.findById(id).orElse(null);
    }

    @Override
    public Adresse selectAdresseByIdWithOrElse(long id) {
        Adresse defaultAdresse = Adresse.builder()
                .rue("rue 5 decembre")
                .ville("zarzis")
                .codePostal(4170)
                .build();
        return adresseRepository.findById(id).orElse(defaultAdresse);
    }

    @Override
    public List<Adresse> selectAllAdresses() {
        return adresseRepository.findAll();
    }

    @Override
    public void deleteAdresseById(long id) {
        adresseRepository.deleteById(id);
    }

    @Override
    public void deleteAllAdresses() {
        adresseRepository.deleteAll();
    }

    @Override
    public void deleteAdresse(Adresse adr) {
        adresseRepository.delete(adr);
    }

    @Override
    public long countingAdresses() {
        return adresseRepository.count();
    }

    @Override
    public boolean verifAdresseById(long id) {
        return adresseRepository.existsById(id);
    }
}