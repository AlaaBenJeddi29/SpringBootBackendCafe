package tn.esprit.tpcafe_alaa_benjeddi.services.adresse;

import tn.esprit.tpcafe_alaa_benjeddi.entities.Adresse;

import java.util.List;

public interface IAdresseServiceImpl {

    Adresse addAdresse(Adresse adr);
    List<Adresse> saveAdresses(List<Adresse> adresses);
    Adresse selectAdresseByIdWithGet(long id);
    Adresse selectAdresseByIdWithOrElse(long id);
    List <Adresse> selectAllAdresses();
    void deleteAdresseById(long id);
    void deleteAllAdresses();
    void deleteAdresse(Adresse adr);
    long countingAdresses();
    boolean verifAdresseById(long id);


}
