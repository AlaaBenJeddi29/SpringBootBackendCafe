package tn.esprit.tpcafe_alaa_benjeddi.services.client;

import tn.esprit.tpcafe_alaa_benjeddi.entities.Client;
import java.util.List;

public interface IClientServiceImpl {

    Client addClient(Client client);
    List<Client> saveClients(List<Client> clients);
    Client selectClientByIdWithGet(long id);
    Client selectClientByIdWithOrElse(long id);
    List<Client> selectAllClients();
    void deleteClientById(long id);
    void deleteAllClients();
    void deleteClient(Client client);
    long countingClients();
    boolean verifClientById(long id);
}