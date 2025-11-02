package tn.esprit.tpcafe_alaa_benjeddi.restControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpcafe_alaa_benjeddi.entities.CarteFidelite;
import tn.esprit.tpcafe_alaa_benjeddi.services.cartefidelite.ICarteFideliteServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
@Tag(name = "Loyalty Program", description = "Manage customer loyalty cards and points")
@RequestMapping("cartes-fidelite")
public class CarteFideliteRestController {

    private ICarteFideliteServiceImpl carteService;

    @Operation(summary = "List All Cards", description = "View all loyalty cards.")
    @GetMapping
    public List<CarteFidelite> selectAllCartesFidelite() {
        return carteService.selectAllCartesFidelite();
    }

    @Operation(summary = "Create Card", description = "Issue new loyalty card.")
    @PostMapping
    public CarteFidelite addCarteFidelite(@RequestBody CarteFidelite carteFidelite) {
        return carteService.addCarteFidelite(carteFidelite);
    }

    @Operation(summary = "Bulk Import", description = "Import multiple cards.")
    @PostMapping("addCartes")
    public List<CarteFidelite> saveCartesFidelite(@RequestBody List<CarteFidelite> cartesFidelite) {
        return carteService.saveCartesFidelite(cartesFidelite);
    }

    @Operation(summary = "Get by ID (GET)", description = "Fetch using findById().get()")
    @GetMapping("selectById/{id}")
    public CarteFidelite selectCarteFideliteByIdWithGet(@PathVariable long id) {
        return carteService.selectCarteFideliteByIdWithGet(id);
    }

    @Operation(summary = "Get by ID (orElse)", description = "Fetch with null fallback")
    @GetMapping("selectById2")
    public CarteFidelite selectCarteFideliteByIdWithOrElse(@RequestParam long id) {
        return carteService.selectCarteFideliteByIdWithOrElse(id);
    }

    @Operation(summary = "Delete by ID", description = "Remove card.")
    @DeleteMapping("deleteById/{id}")
    public void deleteCarteFideliteById(@PathVariable long id) {
        carteService.deleteCarteFideliteById(id);
    }

    @Operation(summary = "Purge All", description = "Delete all cards.")
    @DeleteMapping("deleteAll")
    public void deleteAllCartesFidelite() {
        carteService.deleteAllCartesFidelite();
    }

    @Operation(summary = "Delete by Object", description = "Delete using full card object.")
    @DeleteMapping("delete")
    public void deleteCarteFidelite(@RequestBody CarteFidelite carteFidelite) {
        carteService.deleteCarteFidelite(carteFidelite);
    }

    @Operation(summary = "Count", description = "Total number of cards.")
    @GetMapping("count")
    public long countingCartesFidelite() {
        return carteService.countingCartesFidelite();
    }

    @Operation(summary = "Exists?", description = "Check if card ID exists.")
    @GetMapping("verify/{id}")
    public boolean verifCarteFideliteById(@PathVariable long id) {
        return carteService.verifCarteFideliteById(id);
    }
}