package tn.esprit.tpcafe_alaa_benjeddi.services.client;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Client;
import tn.esprit.tpcafe_alaa_benjeddi.repositories.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientServiceImpl {

    private final ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> saveClients(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }

    @Override
    public Client selectClientByIdWithGet(long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public Client selectClientByIdWithOrElse(long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> selectAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClientById(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public void deleteAllClients() {
        clientRepository.deleteAll();
    }

    @Override
    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

    @Override
    public long countingClients() {
        return clientRepository.count();
    }

    @Override
    public boolean verifClientById(long id) {
        return clientRepository.existsById(id);
    }
}