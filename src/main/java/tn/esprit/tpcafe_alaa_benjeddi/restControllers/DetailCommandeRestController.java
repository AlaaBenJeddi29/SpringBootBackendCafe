package tn.esprit.tpcafe_alaa_benjeddi.restControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Detail_Commande;
import tn.esprit.tpcafe_alaa_benjeddi.services.detailcommande.IDetailCommandeServiceImpl;

import java.util.List;
@RestController
@AllArgsConstructor
@Tag(name = "Order Line Items", description = "Manage items inside an order (quantity, price)")
@RequestMapping("details-commande")
public class DetailCommandeRestController {

    private IDetailCommandeServiceImpl detailService;

    @Operation(summary = "List All Details", description = "View all order line items.")
    @GetMapping
    public List<Detail_Commande> selectAllDetailsCommande() {
        return detailService.selectAllDetailsCommande();
    }

    @Operation(summary = "Add Item", description = "Add article to order.")
    @PostMapping
    public Detail_Commande addDetailCommande(@RequestBody Detail_Commande detailCommande) {
        return detailService.addDetailCommande(detailCommande);
    }

    @Operation(summary = "Bulk Import", description = "Import multiple details.")
    @PostMapping("addDetails")
    public List<Detail_Commande> saveDetailsCommande(@RequestBody List<Detail_Commande> detailsCommande) {
        return detailService.saveDetailsCommande(detailsCommande);
    }

    @Operation(summary = "Get by ID (GET)", description = "Fetch using findById().get()")
    @GetMapping("selectById/{id}")
    public Detail_Commande selectDetailCommandeByIdWithGet(@PathVariable long id) {
        return detailService.selectDetailCommandeByIdWithGet(id);
    }

    @Operation(summary = "Get by ID (orElse)", description = "Fetch with null fallback")
    @GetMapping("selectById2")
    public Detail_Commande selectDetailCommandeByIdWithOrElse(@RequestParam long id) {
        return detailService.selectDetailCommandeByIdWithOrElse(id);
    }

    @Operation(summary = "Delete by ID", description = "Remove item from order.")
    @DeleteMapping("deleteById/{id}")
    public void deleteDetailCommandeById(@PathVariable long id) {
        detailService.deleteDetailCommandeById(id);
    }

    @Operation(summary = "Purge All", description = "Delete all details.")
    @DeleteMapping("deleteAll")
    public void deleteAllDetailsCommande() {
        detailService.deleteAllDetailsCommande();
    }

    @Operation(summary = "Delete by Object", description = "Delete using full detail object.")
    @DeleteMapping("delete")
    public void deleteDetailCommande(@RequestBody Detail_Commande detailCommande) {
        detailService.deleteDetailCommande(detailCommande);
    }

    @Operation(summary = "Count", description = "Total number of details.")
    @GetMapping("count")
    public long countingDetailsCommande() {
        return detailService.countingDetailsCommande();
    }

    @Operation(summary = "Exists?", description = "Check if detail ID exists.")
    @GetMapping("verify/{id}")
    public boolean verifDetailCommandeById(@PathVariable long id) {
        return detailService.verifDetailCommandeById(id);
    }
}