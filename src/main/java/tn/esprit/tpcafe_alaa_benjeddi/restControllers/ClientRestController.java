package tn.esprit.tpcafe_alaa_benjeddi.restControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Client;
import tn.esprit.tpcafe_alaa_benjeddi.services.client.IClientServiceImpl;

import java.util.List;
@RestController
@AllArgsConstructor
@Tag(name = "Customer Management", description = "Handle client profiles and registration")
@RequestMapping("clients")
public class ClientRestController {

    private IClientServiceImpl clientService;

    @Operation(summary = "List All Clients", description = "View all registered customers.")
    @GetMapping
    public List<Client> selectAllClients() {
        return clientService.selectAllClients();
    }

    @Operation(summary = "Register Client", description = "Create new customer account.")
    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @Operation(summary = "Bulk Import", description = "Import multiple clients.")
    @PostMapping("addClients")
    public List<Client> saveClients(@RequestBody List<Client> clients) {
        return clientService.saveClients(clients);
    }

    @Operation(summary = "Get by ID (GET)", description = "Fetch using findById().get()")
    @GetMapping("selectById/{id}")
    public Client selectClientByIdWithGet(@PathVariable long id) {
        return clientService.selectClientByIdWithGet(id);
    }

    @Operation(summary = "Get by ID (orElse)", description = "Fetch with null fallback")
    @GetMapping("selectById2")
    public Client selectClientByIdWithOrElse(@RequestParam long id) {
        return clientService.selectClientByIdWithOrElse(id);
    }

    @Operation(summary = "Delete by ID", description = "Remove client.")
    @DeleteMapping("deleteById/{id}")
    public void deleteClientById(@PathVariable long id) {
        clientService.deleteClientById(id);
    }

    @Operation(summary = "Purge All", description = "Delete all clients.")
    @DeleteMapping("deleteAll")
    public void deleteAllClients() {
        clientService.deleteAllClients();
    }

    @Operation(summary = "Delete by Object", description = "Delete using full client object.")
    @DeleteMapping("delete")
    public void deleteClient(@RequestBody Client client) {
        clientService.deleteClient(client);
    }

    @Operation(summary = "Count", description = "Total number of clients.")
    @GetMapping("count")
    public long countingClients() {
        return clientService.countingClients();
    }

    @Operation(summary = "Exists?", description = "Check if client ID exists.")
    @GetMapping("verify/{id}")
    public boolean verifClientById(@PathVariable long id) {
        return clientService.verifClientById(id);
    }
}