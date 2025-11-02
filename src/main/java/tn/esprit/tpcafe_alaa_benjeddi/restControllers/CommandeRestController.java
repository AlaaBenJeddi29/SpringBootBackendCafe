package tn.esprit.tpcafe_alaa_benjeddi.restControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Commande;
import tn.esprit.tpcafe_alaa_benjeddi.services.commande.ICommandeServiceImpl;

import java.util.List;
@RestController
@AllArgsConstructor
@Tag(name = "Order Processing", description = "Manage customer orders from creation to delivery")
@RequestMapping("commandes")
public class CommandeRestController {

    private ICommandeServiceImpl commandeService;

    @Operation(summary = "List All Orders", description = "View all orders with status.")
    @GetMapping
    public List<Commande> selectAllCommandes() {
        return commandeService.selectAllCommandes();
    }

    @Operation(summary = "Place Order", description = "Create new order.")
    @PostMapping
    public Commande addCommande(@RequestBody Commande commande) {
        return commandeService.addCommande(commande);
    }

    @Operation(summary = "Bulk Import", description = "Import multiple orders.")
    @PostMapping("addCommandes")
    public List<Commande> saveCommandes(@RequestBody List<Commande> commandes) {
        return commandeService.saveCommandes(commandes);
    }

    @Operation(summary = "Get by ID (GET)", description = "Fetch using findById().get()")
    @GetMapping("selectById/{id}")
    public Commande selectCommandeByIdWithGet(@PathVariable long id) {
        return commandeService.selectCommandeByIdWithGet(id);
    }

    @Operation(summary = "Get by ID (orElse)", description = "Fetch with null fallback")
    @GetMapping("selectById2")
    public Commande selectCommandeByIdWithOrElse(@RequestParam long id) {
        return commandeService.selectCommandeByIdWithOrElse(id);
    }

    @Operation(summary = "Delete by ID", description = "Remove order.")
    @DeleteMapping("deleteById/{id}")
    public void deleteCommandeById(@PathVariable long id) {
        commandeService.deleteCommandeById(id);
    }

    @Operation(summary = "Purge All", description = "Delete all orders.")
    @DeleteMapping("deleteAll")
    public void deleteAllCommandes() {
        commandeService.deleteAllCommandes();
    }

    @Operation(summary = "Delete by Object", description = "Delete using full order object.")
    @DeleteMapping("delete")
    public void deleteCommande(@RequestBody Commande commande) {
        commandeService.deleteCommande(commande);
    }

    @Operation(summary = "Count", description = "Total number of orders.")
    @GetMapping("count")
    public long countingCommandes() {
        return commandeService.countingCommandes();
    }

    @Operation(summary = "Exists?", description = "Check if order ID exists.")
    @GetMapping("verify/{id}")
    public boolean verifCommandeById(@PathVariable long id) {
        return commandeService.verifCommandeById(id);
    }
}